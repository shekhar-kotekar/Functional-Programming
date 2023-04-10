# Functional-Programming
This repository contains code written while learning functional programming in Scala, Python and Rust programming languages.

## Python IDE settings
1. Create conda environment using below command

`conda create -n python_3_10_env python=3.10 anaconda`
2. Click on `File -> Project Structure -> Modules -> + (Add) + Import Module` to add a new module in the project

3. Browse to `<Project root directory> -> python` directory and then click `Open`

4. Select `Create module from existing sources` then click `next` and click on `Create`. This step will add a Python module in the project 

5. Now we need to specify `Module SDK` for this Python module. Select `python` under the list of modules
6. Under `Project Structure` -> `Dependencies` section -> Click on `Module SDK`
7. Select the conda environment we created in step 1 and click on apply.

## Scala IDE settings
1. Click on `File -> Project Structure -> Modules -> + (Add) + Import Module` to add a new module in the project
2. Browse to `<Project root directory> -> scala` directory and then select `build.sbt` file
3. Select `sbt` in next window and click `next`
4. Select `Project JDK` and then click on `Create`
5. Now SBT will add a new module, will import dependencies if needed, and we will be able to write Scala code.