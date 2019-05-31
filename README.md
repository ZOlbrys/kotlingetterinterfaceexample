# kotlingetterinterfaceexample
Example of issues with using a set of kotlin getter/setter interfaces and GSON parsing

Running the `testParseObject` test will fail due to the `ExampleKotlinImplSubclass` and `ExampleKotlinImpl` classes both having a param named 'name'.  The `ExampleKotlinImpl` defines this value as a val, but `ExampleKotlinImplSubclass` sets it as a var.  This is done because the subclass should be able to set the value, but the super class should only expose that it can read the value.
