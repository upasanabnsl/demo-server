package org.uscs.com.gradle

import org.gradle.testkit.runner.BuildResult
import org.gradle.testkit.runner.TaskOutcome

/**
 * @author Upasana Bansal
 * @since 1.03.2022
 */
class GradlePluginKitTest extends AbstractKitTest {

    def "Check plugin execution"() {
        setup:
        build """
            plugins {
                id 'org.uscs.com.gradle'
            }

            gradle {
                foo '1'
                bar '2'
            }

            task printFoo() {
                doLast {
                    println "fooo: \$gradle.foo"
                }
            }

        """

        when: "run task"
        BuildResult result = run('printFoo')

        then: "task successful"
        result.task(':printFoo').outcome == TaskOutcome.SUCCESS
        result.output.contains('fooo: 1')
    }
}