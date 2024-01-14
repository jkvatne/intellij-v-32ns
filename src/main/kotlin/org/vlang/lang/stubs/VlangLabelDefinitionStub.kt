package org.vlang.lang.stubs

import com.intellij.psi.stubs.IStubElementType
import com.intellij.psi.stubs.StubElement
import com.intellij.util.io.StringRef
import org.vlang.lang.psi.VlangLabelDefinition

class VlangLabelDefinitionStub : VlangNamedStub<VlangLabelDefinition> {
    constructor(parent: StubElement<*>?, elementType: IStubElementType<*, *>, name: StringRef?) :
            super(parent, elementType, name, true)

    constructor(parent: StubElement<*>?, elementType: IStubElementType<*, *>, name: String?) :
            super(parent, elementType, name, true)
}
