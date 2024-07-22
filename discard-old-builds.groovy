// discard_old_builds.groovy
job('example') {
    logRotator {
        daysToKeep(30)
        numToKeep(10)
    }
}
