package org.uscs.com.gradle

import groovy.transform.CompileStatic
import groovy.transform.TypeCheckingMode
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.GradleException

/**
 * gradle plugin.
 *
 * @author Upasana Bansal
 * @since 1.03.2022
 */
@CompileStatic
class GradlePlugin implements Plugin<Project> {

    @Override
    @CompileStatic(TypeCheckingMode.SKIP)
    void apply(Project project) {
        GradleExtension extension = project.extensions.create('gradle', GradleExtension)

        project.afterEvaluate {
            if (extension.bar == null) {
                throw new GradleException('gradle.bar configuration required')
            }
        }
    }
}
