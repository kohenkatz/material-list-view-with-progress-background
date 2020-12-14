# material-list-view-with-progress-background
A PoC Google Material Design List view with progress bars as the background for each list item

This code is based on Google's Material Components [Lists](https://github.com/material-components/material-components-android/tree/master/catalog/java/io/material/catalog/lists), with the addition of the background progress bar.

To implement this, two changes were required:

1. Convert Google's `RelativeLayout` into a `ConstraintLayout`
2. Add a `Guideline` set to the appropriate percentage and a `View` with a colored background that is constrained to that `Guideline`

---

NOTE: Although Google's Material Design repository has code in it for handling lists, Google does not yet ship that code as part of their Material Design releases, so we had to copy it from their repo.
