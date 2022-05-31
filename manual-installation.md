# Install Eclipse Capra manually

Use the following instructions to try out the TIM:  

1. **Install Eclipse Capra**: 
  * Download Eclipse Capra development environment using instructions provided [here](https://wiki.eclipse.org/Capra#Using_the_Eclipse_Installer). The recommended version of Eclipse Capra to use is the current develop branch 0.9.0. Please note, however, that changes in the develop branch can lead to incompatibilites that need to be resolved manually. At the time of writing, the MobSTr dataset is known to work with commit [20a806bf](https://git.eclipse.org/c/capra/org.eclipse.capra.git/commit/?h=develop&id=20a806bf4a564e27081beff118ce22b5384f5837).
2. **Get the ODE meta-model dependencies**: Use the "Install new Software" feature to install the ODE meta-model and editors using the ODE update site at: https://digital-dependability-identities.github.io/ODE_Editor/
3. **Install the "UML2 Extender SDK"**: Use the "Install new Software" feature to install the UML2 Extender SDK from the release update site of your Eclipse version.
4. **Import the TIM project**
  * Clone this GitHub project.
  * Close the project `org.eclipse.capra.generic.tracemodel`.
  * Import the project `org.panorama-research.mobstr.tim` into your workspace.
  * Make sure that all the projects have no errors. Some of Eclipse Capra's test projects might show compilation errors due to the missing `org.eclipse.capra.generic.tracemodel` project. You can either ignore these or close the test projects.
