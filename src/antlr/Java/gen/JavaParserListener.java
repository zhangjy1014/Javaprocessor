// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParserParser}.
 */
public interface JavaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JavaParserParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JavaParserParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaParserParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaParserParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaParserParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaParserParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(JavaParserParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(JavaParserParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(JavaParserParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(JavaParserParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(JavaParserParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(JavaParserParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(JavaParserParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(JavaParserParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JavaParserParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JavaParserParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(JavaParserParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(JavaParserParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(JavaParserParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(JavaParserParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(JavaParserParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(JavaParserParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(JavaParserParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(JavaParserParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(JavaParserParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(JavaParserParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(JavaParserParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(JavaParserParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(JavaParserParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(JavaParserParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(JavaParserParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(JavaParserParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(JavaParserParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(JavaParserParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(JavaParserParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(JavaParserParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(JavaParserParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(JavaParserParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(JavaParserParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(JavaParserParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(JavaParserParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(JavaParserParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JavaParserParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JavaParserParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(JavaParserParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(JavaParserParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(JavaParserParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(JavaParserParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(JavaParserParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(JavaParserParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(JavaParserParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(JavaParserParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void enterModuleName(JavaParserParser.ModuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void exitModuleName(JavaParserParser.ModuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(JavaParserParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(JavaParserParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(JavaParserParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(JavaParserParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(JavaParserParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(JavaParserParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(JavaParserParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(JavaParserParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(JavaParserParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(JavaParserParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(JavaParserParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(JavaParserParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaParserParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaParserParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#ordinaryCompilation}.
	 * @param ctx the parse tree
	 */
	void enterOrdinaryCompilation(JavaParserParser.OrdinaryCompilationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#ordinaryCompilation}.
	 * @param ctx the parse tree
	 */
	void exitOrdinaryCompilation(JavaParserParser.OrdinaryCompilationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#modularCompilation}.
	 * @param ctx the parse tree
	 */
	void enterModularCompilation(JavaParserParser.ModularCompilationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#modularCompilation}.
	 * @param ctx the parse tree
	 */
	void exitModularCompilation(JavaParserParser.ModularCompilationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JavaParserParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JavaParserParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(JavaParserParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(JavaParserParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JavaParserParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JavaParserParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(JavaParserParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(JavaParserParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(JavaParserParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(JavaParserParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(JavaParserParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(JavaParserParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(JavaParserParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(JavaParserParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JavaParserParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JavaParserParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(JavaParserParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(JavaParserParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void enterModuleDirective(JavaParserParser.ModuleDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void exitModuleDirective(JavaParserParser.ModuleDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void enterRequiresModifier(JavaParserParser.RequiresModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void exitRequiresModifier(JavaParserParser.RequiresModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaParserParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaParserParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(JavaParserParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(JavaParserParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(JavaParserParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(JavaParserParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(JavaParserParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(JavaParserParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(JavaParserParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(JavaParserParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(JavaParserParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(JavaParserParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(JavaParserParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(JavaParserParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(JavaParserParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(JavaParserParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaParserParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaParserParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JavaParserParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JavaParserParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(JavaParserParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(JavaParserParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaParserParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaParserParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(JavaParserParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(JavaParserParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(JavaParserParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(JavaParserParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaParserParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaParserParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JavaParserParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JavaParserParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JavaParserParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JavaParserParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(JavaParserParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(JavaParserParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(JavaParserParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(JavaParserParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(JavaParserParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(JavaParserParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(JavaParserParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(JavaParserParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(JavaParserParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(JavaParserParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(JavaParserParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(JavaParserParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(JavaParserParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(JavaParserParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(JavaParserParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(JavaParserParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(JavaParserParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(JavaParserParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(JavaParserParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(JavaParserParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(JavaParserParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(JavaParserParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(JavaParserParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(JavaParserParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaParserParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaParserParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(JavaParserParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(JavaParserParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(JavaParserParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(JavaParserParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(JavaParserParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(JavaParserParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(JavaParserParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(JavaParserParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JavaParserParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JavaParserParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JavaParserParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JavaParserParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JavaParserParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JavaParserParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JavaParserParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JavaParserParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(JavaParserParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(JavaParserParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(JavaParserParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(JavaParserParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(JavaParserParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(JavaParserParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(JavaParserParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(JavaParserParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(JavaParserParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(JavaParserParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaParserParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaParserParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(JavaParserParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(JavaParserParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(JavaParserParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(JavaParserParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JavaParserParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JavaParserParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(JavaParserParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(JavaParserParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(JavaParserParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(JavaParserParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(JavaParserParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(JavaParserParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(JavaParserParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(JavaParserParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(JavaParserParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(JavaParserParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JavaParserParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JavaParserParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(JavaParserParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(JavaParserParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(JavaParserParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(JavaParserParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JavaParserParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JavaParserParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(JavaParserParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(JavaParserParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JavaParserParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JavaParserParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JavaParserParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JavaParserParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(JavaParserParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(JavaParserParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(JavaParserParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(JavaParserParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(JavaParserParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(JavaParserParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JavaParserParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JavaParserParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(JavaParserParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(JavaParserParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(JavaParserParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(JavaParserParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(JavaParserParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(JavaParserParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(JavaParserParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(JavaParserParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(JavaParserParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(JavaParserParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(JavaParserParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(JavaParserParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(JavaParserParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(JavaParserParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(JavaParserParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(JavaParserParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(JavaParserParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(JavaParserParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(JavaParserParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(JavaParserParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(JavaParserParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(JavaParserParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JavaParserParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JavaParserParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(JavaParserParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(JavaParserParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(JavaParserParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(JavaParserParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(JavaParserParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(JavaParserParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(JavaParserParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(JavaParserParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(JavaParserParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(JavaParserParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(JavaParserParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(JavaParserParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(JavaParserParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(JavaParserParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(JavaParserParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(JavaParserParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JavaParserParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JavaParserParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(JavaParserParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(JavaParserParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(JavaParserParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(JavaParserParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JavaParserParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JavaParserParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(JavaParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(JavaParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JavaParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JavaParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(JavaParserParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(JavaParserParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(JavaParserParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(JavaParserParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(JavaParserParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(JavaParserParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(JavaParserParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(JavaParserParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(JavaParserParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(JavaParserParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JavaParserParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JavaParserParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(JavaParserParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(JavaParserParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(JavaParserParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(JavaParserParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(JavaParserParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(JavaParserParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(JavaParserParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(JavaParserParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(JavaParserParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(JavaParserParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(JavaParserParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(JavaParserParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(JavaParserParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(JavaParserParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(JavaParserParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(JavaParserParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(JavaParserParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(JavaParserParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(JavaParserParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(JavaParserParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(JavaParserParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(JavaParserParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JavaParserParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JavaParserParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(JavaParserParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(JavaParserParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(JavaParserParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(JavaParserParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JavaParserParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JavaParserParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(JavaParserParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(JavaParserParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(JavaParserParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(JavaParserParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(JavaParserParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(JavaParserParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JavaParserParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JavaParserParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(JavaParserParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(JavaParserParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(JavaParserParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(JavaParserParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(JavaParserParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(JavaParserParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(JavaParserParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(JavaParserParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JavaParserParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JavaParserParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JavaParserParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JavaParserParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaParserParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaParserParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(JavaParserParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(JavaParserParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(JavaParserParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(JavaParserParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(JavaParserParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(JavaParserParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(JavaParserParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(JavaParserParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JavaParserParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JavaParserParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(JavaParserParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(JavaParserParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(JavaParserParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(JavaParserParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(JavaParserParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(JavaParserParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(JavaParserParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(JavaParserParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(JavaParserParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(JavaParserParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(JavaParserParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(JavaParserParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(JavaParserParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(JavaParserParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void enterVariableAccess(JavaParserParser.VariableAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void exitVariableAccess(JavaParserParser.VariableAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JavaParserParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JavaParserParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(JavaParserParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(JavaParserParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(JavaParserParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(JavaParserParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(JavaParserParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(JavaParserParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(JavaParserParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(JavaParserParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(JavaParserParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(JavaParserParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(JavaParserParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(JavaParserParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(JavaParserParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(JavaParserParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(JavaParserParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(JavaParserParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(JavaParserParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(JavaParserParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classLiteral}.
	 * @param ctx the parse tree
	 */
	void enterClassLiteral(JavaParserParser.ClassLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classLiteral}.
	 * @param ctx the parse tree
	 */
	void exitClassLiteral(JavaParserParser.ClassLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(JavaParserParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(JavaParserParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(JavaParserParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(JavaParserParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(JavaParserParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(JavaParserParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(JavaParserParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(JavaParserParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(JavaParserParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(JavaParserParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(JavaParserParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(JavaParserParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(JavaParserParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(JavaParserParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(JavaParserParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(JavaParserParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(JavaParserParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(JavaParserParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(JavaParserParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(JavaParserParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(JavaParserParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(JavaParserParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(JavaParserParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(JavaParserParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(JavaParserParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(JavaParserParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JavaParserParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JavaParserParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(JavaParserParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(JavaParserParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(JavaParserParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(JavaParserParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(JavaParserParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(JavaParserParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(JavaParserParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(JavaParserParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(JavaParserParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(JavaParserParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(JavaParserParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(JavaParserParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(JavaParserParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(JavaParserParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(JavaParserParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(JavaParserParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(JavaParserParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(JavaParserParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(JavaParserParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(JavaParserParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(JavaParserParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(JavaParserParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JavaParserParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JavaParserParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JavaParserParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JavaParserParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(JavaParserParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(JavaParserParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JavaParserParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JavaParserParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(JavaParserParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(JavaParserParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(JavaParserParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(JavaParserParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(JavaParserParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(JavaParserParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(JavaParserParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(JavaParserParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(JavaParserParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(JavaParserParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(JavaParserParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(JavaParserParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JavaParserParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JavaParserParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JavaParserParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JavaParserParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(JavaParserParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(JavaParserParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JavaParserParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JavaParserParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JavaParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JavaParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JavaParserParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JavaParserParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(JavaParserParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(JavaParserParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(JavaParserParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(JavaParserParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(JavaParserParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(JavaParserParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(JavaParserParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(JavaParserParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(JavaParserParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(JavaParserParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(JavaParserParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(JavaParserParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(JavaParserParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(JavaParserParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(JavaParserParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(JavaParserParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(JavaParserParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(JavaParserParser.CastExpressionContext ctx);
}