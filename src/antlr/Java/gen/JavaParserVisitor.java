// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(JavaParserParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JavaParserParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JavaParserParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(JavaParserParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(JavaParserParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(JavaParserParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(JavaParserParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(JavaParserParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(JavaParserParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(JavaParserParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(JavaParserParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(JavaParserParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(JavaParserParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(JavaParserParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(JavaParserParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(JavaParserParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(JavaParserParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(JavaParserParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(JavaParserParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(JavaParserParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(JavaParserParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(JavaParserParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(JavaParserParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(JavaParserParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(JavaParserParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(JavaParserParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#moduleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleName(JavaParserParser.ModuleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(JavaParserParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(JavaParserParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(JavaParserParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(JavaParserParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(JavaParserParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(JavaParserParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JavaParserParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#ordinaryCompilation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinaryCompilation(JavaParserParser.OrdinaryCompilationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#modularCompilation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModularCompilation(JavaParserParser.ModularCompilationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(JavaParserParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(JavaParserParser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JavaParserParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(JavaParserParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(JavaParserParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(JavaParserParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(JavaParserParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(JavaParserParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclaration(JavaParserParser.ModuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#moduleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDirective(JavaParserParser.ModuleDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#requiresModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiresModifier(JavaParserParser.RequiresModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaParserParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(JavaParserParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(JavaParserParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(JavaParserParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(JavaParserParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(JavaParserParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(JavaParserParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(JavaParserParser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JavaParserParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(JavaParserParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(JavaParserParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JavaParserParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(JavaParserParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(JavaParserParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JavaParserParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(JavaParserParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(JavaParserParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(JavaParserParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(JavaParserParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(JavaParserParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(JavaParserParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(JavaParserParser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(JavaParserParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(JavaParserParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(JavaParserParser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(JavaParserParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(JavaParserParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(JavaParserParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(JavaParserParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JavaParserParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(JavaParserParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(JavaParserParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(JavaParserParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(JavaParserParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(JavaParserParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(JavaParserParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JavaParserParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(JavaParserParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(JavaParserParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(JavaParserParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(JavaParserParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(JavaParserParser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(JavaParserParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JavaParserParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(JavaParserParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(JavaParserParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(JavaParserParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(JavaParserParser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(JavaParserParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(JavaParserParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(JavaParserParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(JavaParserParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(JavaParserParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(JavaParserParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(JavaParserParser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(JavaParserParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(JavaParserParser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(JavaParserParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(JavaParserParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(JavaParserParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(JavaParserParser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(JavaParserParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(JavaParserParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(JavaParserParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(JavaParserParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(JavaParserParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(JavaParserParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(JavaParserParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(JavaParserParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(JavaParserParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(JavaParserParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(JavaParserParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(JavaParserParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(JavaParserParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(JavaParserParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(JavaParserParser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(JavaParserParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(JavaParserParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(JavaParserParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(JavaParserParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(JavaParserParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(JavaParserParser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(JavaParserParser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(JavaParserParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(JavaParserParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaParserParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(JavaParserParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JavaParserParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(JavaParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(JavaParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaParserParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(JavaParserParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(JavaParserParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(JavaParserParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(JavaParserParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(JavaParserParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(JavaParserParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(JavaParserParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(JavaParserParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(JavaParserParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(JavaParserParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(JavaParserParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(JavaParserParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(JavaParserParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(JavaParserParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(JavaParserParser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(JavaParserParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(JavaParserParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JavaParserParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(JavaParserParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(JavaParserParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JavaParserParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(JavaParserParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(JavaParserParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(JavaParserParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(JavaParserParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(JavaParserParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(JavaParserParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(JavaParserParser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(JavaParserParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(JavaParserParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(JavaParserParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JavaParserParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(JavaParserParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(JavaParserParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(JavaParserParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(JavaParserParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(JavaParserParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(JavaParserParser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(JavaParserParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(JavaParserParser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(JavaParserParser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(JavaParserParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(JavaParserParser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(JavaParserParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#variableAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAccess(JavaParserParser.VariableAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(JavaParserParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(JavaParserParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(JavaParserParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(JavaParserParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(JavaParserParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(JavaParserParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(JavaParserParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(JavaParserParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(JavaParserParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(JavaParserParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#classLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassLiteral(JavaParserParser.ClassLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(JavaParserParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(JavaParserParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(JavaParserParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(JavaParserParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(JavaParserParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(JavaParserParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(JavaParserParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(JavaParserParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(JavaParserParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(JavaParserParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(JavaParserParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(JavaParserParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(JavaParserParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(JavaParserParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(JavaParserParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(JavaParserParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(JavaParserParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(JavaParserParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(JavaParserParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(JavaParserParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(JavaParserParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaParserParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(JavaParserParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(JavaParserParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(JavaParserParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(JavaParserParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(JavaParserParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JavaParserParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(JavaParserParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(JavaParserParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(JavaParserParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(JavaParserParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(JavaParserParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(JavaParserParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(JavaParserParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(JavaParserParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(JavaParserParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(JavaParserParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(JavaParserParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(JavaParserParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(JavaParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(JavaParserParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(JavaParserParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(JavaParserParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(JavaParserParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(JavaParserParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(JavaParserParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(JavaParserParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(JavaParserParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(JavaParserParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(JavaParserParser.CastExpressionContext ctx);
}