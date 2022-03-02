package org.uscs.com.gradle

import org.gradle.api.Project
import org.gradle.api.ProjectConfigurationException
import org.gradle.testfixtures.ProjectBuilder

/**
 * @author Upasana Bansal
 * @since 1.03.2022
 */
class GradlePluginTest extends AbstractTest {

    def "Check extension registration"() {

        when: "plugin applied"
        Project project = ProjectBuilder.builder().build()
        project.plugins.apply "org.uscs.com.gradle"

        then: "extension registered"
        project.extensions.findByType(GradleExtension)

    }

    def "Check extension validation"() {

        when: "plugin configured"
        Project project = project {
            apply plugin: "org.uscs.com.gradle"

            gradle {
                foo '1'
                bar '2'
            }
        }

        then: "validation pass"
        def gradle = project.extensions.gradle;
        gradle.foo == '1'
        gradle.bar == '2'
    }


    def "Check extension validation failure"() {

        when: "plugin configured"
        Project project = project {
            apply plugin: "org.uscs.com.gradle"

            gradle {
                foo '1'
            }
        }

        then: "validation failed"
        def ex = thrown(ProjectConfigurationException)
        ex.cause.message == 'gradle.bar configuration required'
    }

}