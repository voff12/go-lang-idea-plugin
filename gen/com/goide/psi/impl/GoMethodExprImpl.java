// This is a generated file. Not intended for manual editing.
package com.goide.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.goide.GoTypes.*;
import com.goide.psi.*;

public class GoMethodExprImpl extends GoExpressionImpl implements GoMethodExpr {

  public GoMethodExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GoVisitor) ((GoVisitor)visitor).visitMethodExpr(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public GoMethodName getMethodName() {
    return findNotNullChildByClass(GoMethodName.class);
  }

  @Override
  @NotNull
  public GoReceiverType getReceiverType() {
    return findNotNullChildByClass(GoReceiverType.class);
  }

}
