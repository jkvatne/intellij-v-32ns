// This is a generated file. Not intended for manual editing.
package org.vlang.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.vlang.lang.psi.impl.VlangBuiltinReference;

public interface VlangIsRefTypeCallExpr extends VlangExpression, VlangBuiltinCallOwner {

  @Nullable
  VlangExpression getExpression();

  @Nullable
  VlangGenericArguments getGenericArguments();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRparen();

  @NotNull
  PsiElement getIsreftype();

  @NotNull
  VlangBuiltinReference<VlangIsRefTypeCallExpr> getReference();

}