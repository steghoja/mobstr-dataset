# Additional Artifacts Provided by the PANORAMA Project

This repository contains additional artifacts such as requirements and architecture models for the [WATERS FMTV 2019 challenge][1]. It is based on the solution provided by the [PANORAMA research project][2] in the [APP4MC Eclipse project][3]. The corresponding AMALTHEA model of the challenge is included here. The original file can be found in the [APP4MC Github Repository][4].

Requirements and architectural information have been derived directly from the challenge description. We make no claim on the completeness or correctness of the artifacts available for download here.

Additionally, the repository contains a custom traceability information model (TIM) that defines which link types can be created between the different artifacts.

The TIM assumes one is using [Eclipse Capra](https://projects.eclipse.org/projects/modeling.capra) and is therefore implemented as a traceability extension point of the Eclipse Capra tool. The TIM project is `org.panorama.research.waters-2019.traceMetamodel`


## How to Use the Custom TIM

The current TIM is not packaged yet with a Capra distribution and therefore can only be used in the development environment. Use the following instructions to try out the TIM.  

* Download Eclipse Capra development environment using instructions provided [here](https://wiki.eclipse.org/Capra#Using_the_Eclipse_Installer)
* Close the project `org.eclipse.capra.generic.tracemodel`
* Import the project `org.panorama.research.waters-2019.traceMetamodel` into your workspace. 
* Make sure that all the projects have no errors. Some of Capra's test projects might show compilation errors due to the missing `org.eclipse.capra.generic.tracemodel` project. These can be ignored.
* Click on Run --> Run Configurations and create a new Eclipse Application Configuration
* Select a new folder as the workspace for your Eclipse application
* Click "Apply", then "Run"
* Once the new workspace opens, import the projects in this repository (apart from `org.panorama.research.waters-2019.traceMetamodel`)
* Go to perspectives and switch to the Capra perspective
* Follow [this video](https://www.youtube.com/watch?v=XRtLs5OT_yM&feature=youtu.be) to create and visualize traceability links.

In case you get an error that the wrong APP4MC version is installed, please open `waters-challenge-2019.amxmi` in a text editor and change the model version to the APP4MC version you have installed (usually either 0.9.7 or 0.9.9, depending on the target platform chosen for Eclipse Capra).


## License and Copyright

All artifacts provided here are under [Eclipse Public License v2.0][5]. Copyright 2021 by [contributors](CONTRIBUTORS).

[1]: https://www.ecrts.org/archives/fileadmin/WebsitesArchiv/ecrts2019/waters/waters-industrial-challenge/index.html
[2]: https://panorama-research.org/
[3]: https://www.eclipse.org/app4mc/
[4]: https://git.eclipse.org/c/app4mc/org.eclipse.app4mc.examples.git/tree/WATERS-FMTV-challenges
[5]: https://www.eclipse.org/legal/epl-2.0/
