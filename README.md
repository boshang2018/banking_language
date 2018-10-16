# Banking Language

This is an example executable domain-specific modelling language (xDSML) showcasing the use of Henshin for the definition of the operational semantics of xDSMLs. See the [Henshin xDSML Engine repository](https://github.com/szschaler/henshin_xdsmls) for the GEMOC plugin needed to run this example.

## Overview of the language

The banking language is inspired by one of the Henshin tutorials.

The metamodel for the banking system can be seen in the figure below:

![Metamodel](docs/metamodel.png)

This is contained in the project [uk.ac.kcl.inf.modelling.banking.model](uk.ac.kcl.inf.modelling.banking.model/), a standard Ecore project from which the usual Ecore classes can be generated in the usual way.

The metamodel contains (on the left) the structural syntax of a simple, sequential DSL for writing scripts of actions that can happen to accounts. On the right-hand side are meta-classes for capturing run-time state of the model. In a more realistic scenario, we would model these separately and merge them in, for example using Melange or GTS amalgamation, see the relevant literature in the context of GEMOC. For the purposes of this example, we're lazy and have simply merged everything into one metamodel :-) 

Project [uk.ac.kcl.inf.modelling.banking.design](uk.ac.kcl.inf.modelling.banking.design) contains the Sirius design model for the concrete syntax. An example model (contained in project [uk.ac.kcl.inf.modelling.banking.example](uk.ac.kcl.inf.modelling.banking.example), to be set up in a runtime Eclipse instance with the metamodel and concrete syntax plugins installed) can be seen below.

![Model Example](docs/model_example.png)

This shows a simple banking example with a manager and a client, but no accounts. There is also a script, which creates an account, deposits some money, and finally withdraws some money.

The semantics of this modelling language are given by the set of [Henshin](https://www.eclipse.org/henshin/) rules shown below.

![Semantic Rules](docs/semantic_rules.png)

The two rules on the left-hand side move the "program counter" (represented by the script's `current` association). The remaining three rules implement the semantics of the three different types of `ScriptStep` available. They match the current step on the left side of the rule, while the right side of the rule shows the step's effect.

## Running the example

To run the example, right-click on the model in GEMOC Studio and select `Debug As/Debug Configurations...` Create a new `Henshin-Based eXecutable Model` and select the example model and the `.henshin` file as model and operational semantics, respectively. Also, chose the corresponding `.aird` file as the `Animator`.

![Launch configuration](docs/launch_config.png)

When you click on `Debug`, the standard GEMOC debugger will start and allow you to step through the example model.