package org.vlang.ide.run

import com.intellij.execution.lineMarker.ExecutorAction
import com.intellij.execution.lineMarker.RunLineMarkerContributor
import com.intellij.icons.AllIcons
import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType
import org.vlang.lang.VlangTypes
import org.vlang.lang.psi.VlangFunctionDeclaration

class VlangRunLineMarkerProvider : RunLineMarkerContributor() {
    private val contextActions = ExecutorAction.getActions(0)

    override fun getInfo(element: PsiElement): Info? {
        if (element.elementType == VlangTypes.IDENTIFIER) {
            val parent = element.parent
            if (parent is VlangFunctionDeclaration) {
                val name = parent.name
                if (name != "main") {
                    return null
                }

                return Info(AllIcons.RunConfigurations.TestState.Run, { "Run" }, *contextActions)
            }

            return null
        }

        return null
    }
}
