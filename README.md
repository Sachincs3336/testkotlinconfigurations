This branch demonstrates the `kotlin-android` plugin allowing `:app` to be compiled.  
This should not happen, as `:iap` is missing a required dependency on `:common` in order to use 
the `NonnullByDefault` annotation.

Removing `apply plugin: 'kotlin-android'` from `:iap` causes it to fail correctly.
