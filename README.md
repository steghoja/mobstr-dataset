# The MobSTr dataset: *Mo*del-*B*ased *S*afety Assurance and *Tr*aceability

Provided by the [PANORAMA Research Project][2].

<!--ts-->
* [The MobSTr dataset: <em>Mo</em>del-<em>B</em>ased <em>S</em>afety Assurance and <em>Tr</em>aceability](#the-mobstr-dataset-model-based-safety-assurance-and-traceability)
   * [Included Artifacts](#included-artifacts)
   * [The MobSTr TIM](#the-mobstr-tim)
   * [Interacting with the MobSTr Artifacts using the Custom Eclipse Installation](#interacting-with-the-mobstr-artifacts-using-the-custom-eclipse-installation)
   * [Troubleshooting](#troubleshooting)
      * [Incomplete custom Eclipse installation](#incomplete-custom-eclipse-installation)
      * [The traceability matrix shows many entries as "EObject"](#the-traceability-matrix-shows-many-entries-as-eobject)
      * [Compilation errors or errors when opening the runtime Eclipse](#compilation-errors-or-errors-when-opening-the-runtime-eclipse)
      * [Issues opening the Amalthea model](#issues-opening-the-amalthea-model)
   * [Known Uses](#known-uses)
   * [Citing MobSTr](#citing-mobstr)
   * [License and Copyright](#license-and-copyright)

<!-- Added by: runner, at: Fri Sep 24 12:40:58 UTC 2021 -->

<!--te-->

This repository contains artifacts such as requirements and architecture models for the MobSTr dataset, based on the [WATERS FMTV 2019 challenge][1]. The MobSTr dataset provides a number of artifacts and traceability links for use in demonstrating model-based safety assurance and traceability.

The WATERS FMTV 2019 challenge is an industrial case study used as part of the 10th International Workshop on Analysis Tools and Methodologies for Embedded and Real-time Systems (WATERS). It was originally proposed by Arne Hamann, Dakshina Dasari, and Falk Wurst, Corporate Research Robert Bosch GmbH and Ignacio Sañudo, Nicola Capodieci, Paolo Burgio and Marko Bertogna, University of Modena and Reggio Emilia. 

The artifacts in this repository are based on the challenge description and are provided by the [PANORAMA research project][2], specifically by the [contributors][7]. The corresponding Amalthea model for the challenge is included here. The original file can be found in the [Eclipse APP4MC Github Repository][4].

The system described in the WATERS FMTV 2019 challenge and consequently in the MobSTr dataset is an automated driving system that includes lane following and routing features. The original challenge definition was used as a starting point, but refinements have been applied when necessary. We make no claim on the completeness or correctness of any of the artifacts available for download here.


## Included Artifacts

| *Artifact* | *Description* |
|----|----|
| org.panorama-research.mobstr.amalthea | The Amalthea model of the WATERS FMTV 2019 Challenge. You will need [Eclipse APP4MC][3] to open the model. |
| org.panorama-research.mobstr.architecture | A UML model of the components of the system. You will need [Eclipse Papyrus][8] to open the model. |
| org.panorama-research.mobstr.artifacts | A UML model of the artifacts that are part of this dataset. This information model is used as the foundation for the TIM. You will need [Eclipse Papyrus][8] to open the model. |
| org.panorama-research.mobstr.assumptions | An Excel spreadsheet with additional assumptions. |
| org.panorama-research.mobstr.fmea | An [ODE model][6] containing the results of a Failure Mode and Effects Analysis performed for the system. |
| org.panorama-research.mobstr.fta | An [ODE model][6] containing a component fault tree and exemplary fault trees for all identified hazards. |
| org.panorama-research.mobstr.hazards | An Excel spreadsheet with the identified hazards of the system. |
| org.panorama-research.mobstr.requirements | An Excel spreadsheet with the requirements of the system, including safety requirements. |
| org.panorama-research.mobstr.safetycase |  An [ODE model][6] containing the safety case for the system. |
| org.panorama-research.mobstr.src |  Source code generated out of the Amalthea model for two simulators. Please refer to [the README file](org.panorama-research.mobstr.src/README.md) in the folder for more information. |
| org.panorama-research.mobstr.tim | An Eclipse plugin project containing the implementation of the traceability information model (TIM) for Eclipse Capra (see below). |
| org.panorama-research.mobstr.tim.test | An Eclipse test plugin with test cases for the TIM implementation. |
| __WorkspaceTraceModels | The traceability links between the different artifacts conforming to the TIM. Please note that the links are partial, i.e., not all artifacts that should be linked are currently connected by a trace link. |
| WATERS_Industrial_Challenge_2019_final.pdf | The original WATERS FMTV 2019 Challenge description on which the artifacts in this repository are based. |


## The MobSTr TIM

The MobSTr dataset comes with its own custom traceability information model (TIM). The TIM has been designed to fulfill the needs of an organisation that develops a safety-critical product. Therefore, the trace link types, the directionality of the trace link types, and the artifacts they connect are based on the goal to allow constructing a safety case from the existing artifacts as easily as possible and to trace all required evidence from the safety case. In particular, the trace link types are informed by the traceability described in ISO 26262.

Each combination of artifacts that needs to be traced has a unique trace link type which also carries a unique name that reflects its semantics. All trace link types are shown in the figure below. Please note that the cardinalities in the figure differ from the cardinalities that are implemented in the custom TIM (see below). The reason is that while it might make sense that not all hazards are assigned to a safety goal on the global level (e.g., while hazards are developed and refined and safety goals have not yet been updated), no trace links would exist in such cases.

![The information model for the MobSTr dataset](org.panorama-research.mobstr.artifacts/mobstr-tim.png)


## Interacting with the MobSTr Artifacts using the Custom Eclipse Installation

It is possible to use the MobSTr dataset using a custom Eclipse installation that contains all tools required to access the artifacts. This includes [Eclipse Papyrus](13), the [ODE Editor](6), and [APP4MC](3).

The repository also contains a custom traceability information model (TIM) that defines which link types can be created between the different artifacts. The current TIM is based on the artifact model in project `org.panorama-research.mobstr.artifacts` and is implemented for use in [Eclipse Capra](https://eclipse.org/capra). The TIM project is located in `org.panorama-research.mobstr.tim`.

Use the following instructions to install Eclipse and all necessary components of the MobSTr dataset:  

1. **Download the Eclipse Installer** from [here](https://wiki.eclipse.org/Eclipse_Installer).
2. **Install Eclipse Capra**
  * Open the Eclipse Installer.
  * If necessary, switch to "Advanced Mode" using the Hamburger menu in the top right corner (if you don't see that menu, you are already in advanced mode).
  * Select "Eclipse for Committers".
  * Select JDK 11 in the list of possible JREs (Note: please make sure that Java 11 is installed locally on your machine. If that is not the case, please download Java 11 from [here](https://adoptopenjdk.net/index.html?variant=openjdk11&jvmVariant=hotspot) and locate it on your hard drive in this step).
  * The recommended version of Eclipse is *2021-03* at the time of writing. Please select this version from the "Product Version" dropdown menu.
  * Click Next.
  * On the second page, drag and drop [this link](https://panorama-research.github.io/mobstr-dataset/setup/EclipseCapraForMobSTr.setup) onto the "Eclipse Projects" entry in the list.
  * ***Make sure that the checkbox before the entry "Eclipse Capra for MobSTr" is selected.***
  * Click next and follow the rest of the installation process. The Eclipse installer will then download the necessary files, close itself, and start the newly downloaded Eclipse which will then complete the setup. By the end of it, you will have all necessary files on your local machine to start using Eclipse Capra with the MobSTr dataset.
  * You might need to install Graphviz to make the "Capra PlantUML Viewer" work. Please follow the [installation instructions](https://plantuml.com/graphviz-dot) for your platform.
3. **Create a new run configuration**
  * Click on Run --> Run Configurations and create a new Eclipse Application Configuration.
  * Select a new folder as the workspace for your Eclipse application.
  * Click "Apply", then "Run".
  * Depending on your chosen Eclipse version and target platform, you might see a warning about a dependency to `http-client`. This message can be safely ignored.
4. **Import the MobSTr projects into the runtime Eclipse workspace**
  * Once the new workspace opens, import the projects in this repository (apart from `org.panorama-research.mobstr.tim` and `org.panorama-research.mobstr.tim.test`). 
  * Go to Window --> Perspectives and switch to the Capra perspective.
  * Go to the Eclipse preferences, open the "Capra Traceability" tree and select "Office Documents". Select "Use this column as the ID" and make sure the column is "A". The MobSTr dataset uses the first column in Excel files to  identify requirements and hazards.
5. **Start creating and using traceability links**: Follow [this video](https://www.youtube.com/watch?v=XRtLs5OT_yM&feature=youtu.be) to create and visualize traceability links.

If you prefer a more manual installation, please refer to this [separate guide](manual-installation.md).


## Troubleshooting

### Incomplete custom Eclipse installation

During the custom installation process on Windows, it may happen that the process is not completed successfully. This error can be recognized by the fact that no further installation window opens after starting the newly downloaded Eclipse instance and no projects are shown in the Project Explorer. Please delete or rename the temporary `.eclipse` and `.p2` directories in your home directory and start the installation process again.


### The traceability matrix shows many entries as "EObject"

This can happen when the MobSTr projects are imported to the runtime workspace for the first time. Simply restart your runtime Eclipse to fix the issue. Also make sure that you followed the instructions for setting the column as the ID for Office documents as described above.


### Compilation errors or errors when opening the runtime Eclipse

Please make sure that you have JDK 11 installed and that this is the Java runtime your Eclipse is using. Newer JDK versions might not be 100% compatible with Eclipse Capra at this point.


### Issues opening the Amalthea model

In case you get an error that the wrong APP4MC version is installed, please open `mobstr.amxmi` in a text editor and change the model version to the APP4MC version you have installed (usually either 0.9.7 or 1.0.0, depending on the version of Eclipse that you are using and thus the target platform chosen for Eclipse Capra).

### Errors in mobstr-tim.xcore

If you see compilation errors in `mobstr-tim.xcore`, please make sure that the "UML2 Extender SDK" is installed in your Eclipse. That feature contains the genmodels for UML2 which are required for XCore to compile the TIM. It can be found on the release update site.

## Known Uses

The MobSTr dataset is intended to be used as an exemplar and as a dataset for evaluation in all research for which it is relevant. We track the known uses of the dataset [here][12].


## Citing MobSTr

Stable releases of MobSTr are published to Zenodo. You can find the current version [here][10]. If you want to cite the dataset in your own work, please use the bibliographical information on the Zenodo page or this BibTeX entry:

```
@misc{mobstr_2021_06, 
  author={Jan-Philipp Steghöfer and Björn Koopmann
          and Jan Steffen Becker and Ingo Stierand
          and Marc Zeller and Maria Bonner
          and David Schmelter and Salome Maro},
  title={The MobSTr dataset: Model-Based Safety Assurance and Traceability},
  DOI={10.5281/zenodo.4981481},
  publisher={Zenodo}, 
  year={2021},
  month={Jun}
}
```

We have also published a short paper about MobSTr at the [29th IEEE International Requirements Engineering Conference][11]. To cite it, please use the following BibTex entry:

```
@inproceedings{
  author={Jan-Philipp Steghöfer and Björn Koopmann
          and Jan Steffen Becker and Ingo Stierand
          and Marc Zeller and Maria Bonner
          and David Schmelter and Salome Maro},
  title={The MobSTr Dataset -- An Exemplar for Traceability and Model-based Safety Assessment},
  booktitle={Proceedings of the 29th IEEE International Requirements Engineering Conference, Notre Dame, South Bend, USA}
  publisher={IEEE},
  year={2021},
  month={Aug}
}
```


## License and Copyright

All artifacts provided here are under [Eclipse Public License v2.0][5]. Copyright 2020, 2021 by [contributors](CONTRIBUTORS).

[1]: https://www.ecrts.org/archives/fileadmin/WebsitesArchiv/ecrts2019/waters/waters-industrial-challenge/index.html
[2]: https://panorama-research.org/
[3]: https://www.eclipse.org/app4mc/
[4]: https://git.eclipse.org/c/app4mc/org.eclipse.app4mc.examples.git/tree/WATERS-FMTV-challenges
[5]: https://www.eclipse.org/legal/epl-2.0/
[6]: https://github.com/Digital-Dependability-Identities
[7]: CONTRIBUTORS
[8]: https://www.eclipse.org/papyrus/
[9]: https://github.com/Digital-Dependability-Identities/ODE_Editor
[10]: https://zenodo.org/record/4981481
[11]: https://conf.researchr.org/home/re-2021
[12]: KNOWNUSES.md
[13]: https://www.eclipse.org/papyrus/
