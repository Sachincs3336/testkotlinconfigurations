This branch demonstrates the `kotlin-android` plugin allowing `:app` to be compiled.  
This should not happen, as `:iap` is missing a required dependency on `:common` in order to use 
the `NonnullByDefault` annotation.

Removing `apply plugin: 'kotlin-android'` from `:iap` causes it to fail correctly.

Overview of process:
- `:iap` has a pre-preBuild task added by `nonnull.gradle` that generates `package-info.java`
- `package-info.java` references the `NonnullByDefault` annotation from `:common`
- Thus, `:common` _should_ be a required dependency; but if kotlin-android is applied
then the build succeeds even without it.

Either removing `kotlin-android` or placing `package-info.java` in the main source tree 
(_not_ build/generated) will cause the build to fail correctly.