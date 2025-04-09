package io.github.rastiehaiev

import org.gradle.api.Plugin
import org.gradle.api.Project

@Suppress("unused")
class TemplatePlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.extensions.create("templatePlugin", TemplatePluginExtension::class.java)
        target.plugins.apply(TemplateSupportPlugin::class.java)
    }
}

open class TemplatePluginExtension(var enabled: Boolean = false)
