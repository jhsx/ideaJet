// This is a generated file. Not intended for manual editing.
package io.github.jhsx.jet.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JetPipelineStatement extends JetStatement {

  @NotNull
  List<JetExpression> getExpressionList();

  @NotNull
  List<JetPipeline> getPipelineList();

}
