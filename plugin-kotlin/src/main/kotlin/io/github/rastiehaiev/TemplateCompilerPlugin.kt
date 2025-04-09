package io.github.rastiehaiev

import org.jetbrains.kotlin.backend.common.extensions.IrGenerationExtension
import org.jetbrains.kotlin.compiler.plugin.CompilerPluginRegistrar
import org.jetbrains.kotlin.compiler.plugin.ExperimentalCompilerApi
import org.jetbrains.kotlin.config.CompilerConfiguration

@Suppress("Unused")
@OptIn(ExperimentalCompilerApi::class)
class TemplateCompilerPlugin : CompilerPluginRegistrar() {
    override val supportsK2: Boolean = true

    override fun ExtensionStorage.registerExtensions(configuration: CompilerConfiguration) {
        val configurationKeys = configuration.toKeys()
        if (configurationKeys.enabled) {
            val extension = TemplateCompilerIrExtension()
            IrGenerationExtension.registerExtension(extension)
        }
    }
}
