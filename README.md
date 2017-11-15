# README #

# stackoverflow_per_user_histograms

### What is this repository for? ###

This is where the histogram data is stored after being processed by something out of here:
https://github.com/lievcin/stackoverflow_per_user_summary

!!! For now this has only been done on Badges !!!

to run:
### ant clean dist ###
### hadoop jar dist/UserHistogram.jar UserHistogram input out ###
we want them in input as they'll be used again and otherwise would be overwritten.

Initial outputs included in the repo:

* badges_histogram.txt
* more to come...
