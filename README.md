# Sample GWT project

## Description
Demonstrates an issue with IntelliJ IDEA where GWT compilation on JDK11 fails to find `java.sql` classes

I tried to make it so that when you import the Maven model it is recognized as a Web Facet and GWT compiler output included in an artifact. Then simply build the artifact, which should invoke the GWT compiler.

Error I get:
```
Nov 08, 2019 9:55:49 PM org.hibernate.validator.internal.util.Version <clinit>
INFO: HV000001: Hibernate Validator 6.0.17.Final
   Computing all possible rebind results for 'org.camoiloc.sample.client.ValidatorFactory.GwtValidator'
      Rebinding org.camoiloc.sample.client.ValidatorFactory.GwtValidator
         Invoking generator de.knightsoftnet.validators.rebind.ValidatorGenerator
            Generating Validator for  'org.camoiloc.sample.client.ValidatorFactory.GwtValidator'
               Creating interface org.camoiloc.sample.client.ValidatorFactory.GwtValidator
                  Creating the interface for org.camoiloc.sample.shared._DTOValidator
   [ERROR] An internal compiler exception occurred
com.google.gwt.dev.jjs.InternalCompilerException: Unexpected error during visit.
	at com.google.gwt.dev.jjs.ast.JVisitor.translateException(JVisitor.java:111)
	at com.google.gwt.dev.jjs.ast.JModVisitor.accept(JModVisitor.java:276)
	at com.google.gwt.dev.jjs.ast.JModVisitor.accept(JModVisitor.java:265)
	at com.google.gwt.dev.jjs.ast.JVisitor.accept(JVisitor.java:118)
	at com.google.gwt.dev.jjs.ast.JCastOperation.traverse(JCastOperation.java:76)
	at com.google.gwt.dev.jjs.ast.JModVisitor.traverse(JModVisitor.java:361)
	at com.google.gwt.dev.jjs.ast.JModVisitor.accept(JModVisitor.java:273)
	at com.google.gwt.dev.jjs.ast.JModVisitor.accept(JModVisitor.java:265)
	at com.google.gwt.dev.jjs.ast.JVisitor.accept(JVisitor.java:118)
	at com.google.gwt.dev.jjs.ast.JReturnStatement.traverse(JReturnStatement.java:40)
	at com.google.gwt.dev.jjs.ast.JModVisitor$ListContext.traverse(JModVisitor.java:88)
	at com.google.gwt.dev.jjs.ast.JModVisitor.acceptWithInsertRemove(JModVisitor.java:331)
	at com.google.gwt.dev.jjs.ast.JBlock.traverse(JBlock.java:94)
	at com.google.gwt.dev.jjs.ast.JModVisitor.traverse(JModVisitor.java:361)
	at com.google.gwt.dev.jjs.ast.JModVisitor.accept(JModVisitor.java:273)
	at com.google.gwt.dev.jjs.ast.JVisitor.accept(JVisitor.java:139)
	at com.google.gwt.dev.jjs.ast.JVisitor.accept(JVisitor.java:135)
	at com.google.gwt.dev.jjs.ast.JMethodBody.traverse(JMethodBody.java:83)
	at com.google.gwt.dev.jjs.ast.JModVisitor.traverse(JModVisitor.java:361)
	at com.google.gwt.dev.jjs.ast.JModVisitor.accept(JModVisitor.java:273)
	at com.google.gwt.dev.jjs.ast.JModVisitor.accept(JModVisitor.java:265)
	at com.google.gwt.dev.jjs.ast.JMethod.visitChildren(JMethod.java:786)
	at com.google.gwt.dev.jjs.ast.JMethod.traverse(JMethod.java:778)
	at com.google.gwt.dev.jjs.ast.JModVisitor.traverse(JModVisitor.java:361)
	at com.google.gwt.dev.jjs.ast.JModVisitor.accept(JModVisitor.java:273)
	at com.google.gwt.dev.jjs.ast.JModVisitor.accept(JModVisitor.java:265)
	at com.google.gwt.dev.jjs.impl.UnifyAst.mainLoop(UnifyAst.java:1401)
	at com.google.gwt.dev.jjs.impl.UnifyAst.exec(UnifyAst.java:896)
	at com.google.gwt.dev.jjs.JavaToJavaScriptCompiler.unifyJavaAst(JavaToJavaScriptCompiler.java:1410)
	at com.google.gwt.dev.jjs.JavaToJavaScriptCompiler.constructJavaAst(JavaToJavaScriptCompiler.java:1222)
	at com.google.gwt.dev.jjs.JavaToJavaScriptCompiler.precompile(JavaToJavaScriptCompiler.java:1140)
	at com.google.gwt.dev.jjs.JavaToJavaScriptCompiler.precompile(JavaToJavaScriptCompiler.java:255)
	at com.google.gwt.dev.Precompile.precompile(Precompile.java:255)
	at com.google.gwt.dev.Precompile.precompile(Precompile.java:202)
	at com.google.gwt.dev.Precompile.precompile(Precompile.java:143)
	at com.google.gwt.dev.Compiler.compile(Compiler.java:204)
	at com.google.gwt.dev.Compiler.compile(Compiler.java:155)
	at com.google.gwt.dev.Compiler.compile(Compiler.java:144)
	at com.google.gwt.dev.Compiler$1.run(Compiler.java:118)
	at com.google.gwt.dev.CompileTaskRunner.doRun(CompileTaskRunner.java:55)
	at com.google.gwt.dev.CompileTaskRunner.runWithAppropriateLogger(CompileTaskRunner.java:50)
	at com.google.gwt.dev.Compiler.main(Compiler.java:125)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at com.intellij.rt.execution.CommandLineWrapper.main(CommandLineWrapper.java:66)
Caused by: java.lang.NoClassDefFoundError: java/sql/Date
	at org.apache.commons.beanutils.ConvertUtilsBean.registerOther(ConvertUtilsBean.java:730)
	at org.apache.commons.beanutils.ConvertUtilsBean.deregister(ConvertUtilsBean.java:602)
	at org.apache.commons.beanutils.ConvertUtilsBean.<init>(ConvertUtilsBean.java:161)
	at org.apache.commons.beanutils.BeanUtilsBean.<init>(BeanUtilsBean.java:112)
	at org.apache.commons.beanutils.BeanUtilsBean$1.initialValue(BeanUtilsBean.java:63)
	at org.apache.commons.beanutils.BeanUtilsBean$1.initialValue(BeanUtilsBean.java:59)
	at org.apache.commons.beanutils.ContextClassLoaderLocal.get(ContextClassLoaderLocal.java:154)
	at org.apache.commons.beanutils.BeanUtilsBean.getInstance(BeanUtilsBean.java:75)
	at org.apache.commons.beanutils.PropertyUtilsBean.getInstance(PropertyUtilsBean.java:107)
	at org.apache.commons.beanutils.PropertyUtils.getPropertyDescriptors(PropertyUtils.java:518)
	at de.knightsoftnet.validators.rebind.ValidatorCreator.writeGetProperty(ValidatorCreator.java:485)
	at de.knightsoftnet.validators.rebind.ValidatorCreator.writeGetProperty(ValidatorCreator.java:453)
	at de.knightsoftnet.validators.rebind.ValidatorCreator.writeClassBody(ValidatorCreator.java:109)
	at de.knightsoftnet.validators.rebind.AbstractCreator.create(AbstractCreator.java:64)
	at de.knightsoftnet.validators.rebind.ValidatorGenerator.generateGenericValidator(ValidatorGenerator.java:117)
	at de.knightsoftnet.validators.rebind.ValidatorGenerator.generate(ValidatorGenerator.java:71)
	at com.google.gwt.core.ext.IncrementalGenerator.generateNonIncrementally(IncrementalGenerator.java:40)
	at com.google.gwt.dev.javac.StandardGeneratorContext.runGeneratorIncrementally(StandardGeneratorContext.java:745)
	at com.google.gwt.dev.cfg.RuleGenerateWith.realize(RuleGenerateWith.java:103)
	at com.google.gwt.dev.shell.StandardRebindOracle$Rebinder.rebind(StandardRebindOracle.java:78)
	at com.google.gwt.dev.shell.StandardRebindOracle.rebind(StandardRebindOracle.java:262)
	at com.google.gwt.dev.shell.StandardRebindOracle.rebind(StandardRebindOracle.java:251)
	at com.google.gwt.dev.PrecompilationContextCreator$1.getAllPossibleRebindAnswers(PrecompilationContextCreator.java:86)
	at com.google.gwt.dev.jjs.impl.UnifyAst$UnifyVisitor.createStaticRebindExpression(UnifyAst.java:519)
	at com.google.gwt.dev.jjs.impl.UnifyAst$UnifyVisitor.createRebindExpression(UnifyAst.java:487)
	at com.google.gwt.dev.jjs.impl.UnifyAst$UnifyVisitor.maybeHandleMagicMethodCall(UnifyAst.java:415)
	at com.google.gwt.dev.jjs.impl.UnifyAst$UnifyVisitor.visit(UnifyAst.java:402)
	at com.google.gwt.dev.jjs.ast.JMethodCall.traverse(JMethodCall.java:265)
	at com.google.gwt.dev.jjs.ast.JModVisitor.traverse(JModVisitor.java:361)
	at com.google.gwt.dev.jjs.ast.JModVisitor.accept(JModVisitor.java:273)
	... 45 more
Caused by: java.lang.ClassNotFoundException: java.sql.Date
	at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:471)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:588)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
	... 75 more
      [ERROR] at ValidatorFactory.java(20): GWT.create(ValidatorFactory$GwtValidator.class)
         com.google.gwt.dev.jjs.ast.JMethodCall
      [ERROR] at ValidatorFactory.java(20): (AbstractGwtValidator) GWT.create(ValidatorFactory$GwtValidator.class)
         com.google.gwt.dev.jjs.ast.JCastOperation
      [ERROR] at ValidatorFactory.java(20): return (AbstractGwtValidator) GWT.create(ValidatorFactory$GwtValidator.class)
         com.google.gwt.dev.jjs.ast.JReturnStatement
      [ERROR] at ValidatorFactory.java(19): {
  return (AbstractGwtValidator) GWT.create(ValidatorFactory$GwtValidator.class);
}
         com.google.gwt.dev.jjs.ast.JBlock
      [ERROR] at ValidatorFactory.java(19): {
  return (AbstractGwtValidator) GWT.create(ValidatorFactory$GwtValidator.class);
}
         com.google.gwt.dev.jjs.ast.JMethodBody
      [ERROR] at ValidatorFactory.java(19): org.camoiloc.sample.client.ValidatorFactory.createValidator()Lde/knightsoftnet/validators/client/impl/AbstractGwtValidator;
         com.google.gwt.dev.jjs.ast.JMethod
```

## Context
We had a problem where compiling GWT on JDK 11 in IDEA would fail due to `java.sql` module classes not being found even with `--add-modules java.sql`, but would succeed when done through Maven, which led me to look into the `CommandLineWrapper` implementation, in particular how it manages the class path entries. I've discovered that `URLClassLoader`, which is constructed in `CommandLineWrapper` has its parent set as null, which stands for the Bootstrap class loader.

With the introduction of modular system I believe this needs to have changed to be the Platform class loader instead or another method of passing classpath entries should be used in the GWT compilation.
I've successfully tested this change by compiling a modified `idea-rt.jar` and replacing it in my local IDEA installation, which has allowed GWT compilation to succeed.

Pull Request: https://github.com/JetBrains/intellij-community/pull/1192
