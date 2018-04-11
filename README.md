# JShell Scripting


## Third party libraries
The JShell scripting repo currently contains some well-known and very useful third party libraries like Apache Commons Lang 3. Those libraries and their PGP signatures are checked in to the repo for easy use. The version numbers are removed from the file name for easy upgradability, but can be found within the Manifest of the corresponding Jar.

### Verify the signatures of the third party libraries
1. Import the [PGP keys](https://www.apache.org/dist/commons/KEYS) of the Apache Foundation 
2. Verify each library (in `libs` folder) with their signature (e.g. `gpg --verify commons-lang3.jar.asc`)