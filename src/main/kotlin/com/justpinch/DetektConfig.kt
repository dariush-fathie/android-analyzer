package com.justpinch

val DetektConfig = """
autoCorrect: false

test-pattern: # Configure exclusions for test sources
  active: true
  patterns: # Test file regexes
  - '.*/test/.*'
  - '.*/androidTest/.*'
  - '.*Test.kt'
  - '.*Spec.kt'
  - '.*Spek.kt'
  exclude-rule-sets:
  - 'comments'
  exclude-rules:
  - 'NamingRules'
  - 'WildcardImport'
  - 'MagicNumber'
  - 'MaxLineLength'
  - 'LateinitUsage'
  - 'StringLiteralDuplication'
  - 'SpreadOperator'
  - 'TooManyFunctions'
  - 'ForEachOnRange'
  - 'FunctionMaxLength'
  - 'TooGenericExceptionCaught'
  - 'InstanceOfCheckForException'

build:
  maxIssues: 100000
  weights:
  # complexity: 2
  # LongParameterList: 1
  # style: 1
  # comments: 1

processors:
  active: true
  exclude:
  # - 'FunctionCountProcessor'
  # - 'PropertyCountProcessor'
  # - 'ClassCountProcessor'
  # - 'PackageCountProcessor'
  # - 'KtFileCountProcessor'

console-reports:
  active: true
  exclude:
  #  - 'ProjectStatisticsReport'
  #  - 'ComplexityReport'
  #  - 'NotificationReport'
  #  - 'FindingsReport'
  #  - 'BuildFailureReport'

comments:
  active: true
  CommentOverPrivateFunction:
    active: false
  CommentOverPrivateProperty:
    active: false
  EndOfSentenceFormat:
    active: false
    endOfSentenceFormat: ([.?!][ \t\n\r\f<])|([.?!]${'$'})
  UndocumentedPublicClass:
    active: false
    searchInNestedClass: true
    searchInInnerClass: true
    searchInInnerObject: true
    searchInInnerInterface: true
  UndocumentedPublicFunction:
    active: false

complexity:
  active: true
  ComplexCondition:
    active: true
    threshold: 4
  ComplexInterface:
    active: false
    threshold: 10
    includeStaticDeclarations: false
  ComplexMethod:
    active: true
    threshold: 10
    ignoreSingleWhenExpression: false
    ignoreSimpleWhenEntries: false
  LabeledExpression:
    active: false
    ignoredLabels: ""
  LargeClass:
    active: true
    threshold: 600
  LongMethod:
    active: true
    threshold: 60
  LongParameterList:
    active: true
    threshold: 6
    ignoreDefaultParameters: false
  MethodOverloading:
    active: false
    threshold: 6
  NestedBlockDepth:
    active: true
    threshold: 5
  StringLiteralDuplication:
    active: false
    threshold: 3
    ignoreAnnotation: true
    excludeStringsWithLessThan5Characters: true
    ignoreStringsRegex: '${'$'}^'
  TooManyFunctions:
    active: true
    thresholdInFiles: 20
    thresholdInClasses: 20
    thresholdInInterfaces: 20
    thresholdInObjects: 20
    thresholdInEnums: 20
    ignoreDeprecated: true
    ignorePrivate: false
    ignoreOverridden: false

empty-blocks:
  active: true
  EmptyCatchBlock:
    active: true
    allowedExceptionNameRegex: "^(_|(ignore|expected).*)"
  EmptyClassBlock:
    active: true
  EmptyDefaultConstructor:
    active: true
  EmptyDoWhileBlock:
    active: true
  EmptyElseBlock:
    active: true
  EmptyFinallyBlock:
    active: true
  EmptyForBlock:
    active: true
  EmptyFunctionBlock:
    active: true
    ignoreOverriddenFunctions: true
  EmptyIfBlock:
    active: true
  EmptyInitBlock:
    active: true
  EmptyKtFile:
    active: true
  EmptySecondaryConstructor:
    active: true
  EmptyWhenBlock:
    active: true
  EmptyWhileBlock:
    active: true

exceptions:
  active: true
  ExceptionRaisedInUnexpectedLocation:
    active: false
    methodNames: 'toString,hashCode,equals,finalize'
  InstanceOfCheckForException:
    active: false
  NotImplementedDeclaration:
    active: false
  PrintStackTrace:
    active: false
  RethrowCaughtException:
    active: false
  ReturnFromFinally:
    active: false
  SwallowedException:
    active: false
    ignoredExceptionTypes: 'InterruptedException,NumberFormatException,ParseException,MalformedURLException'
  ThrowingExceptionFromFinally:
    active: false
  ThrowingExceptionInMain:
    active: false
  ThrowingExceptionsWithoutMessageOrCause:
    active: false
    exceptions: 'IllegalArgumentException,IllegalStateException,IOException'
  ThrowingNewInstanceOfSameException:
    active: false
  TooGenericExceptionCaught:
    active: true
    exceptionNames:
    - ArrayIndexOutOfBoundsException
    - Error
    - Exception
    - IllegalMonitorStateException
    - NullPointerException
    - IndexOutOfBoundsException
    - RuntimeException
    - Throwable
    allowedExceptionNameRegex: "^(_|(ignore|expected).*)"
  TooGenericExceptionThrown:
    active: true
    exceptionNames:
    - Error
    - Exception
    - Throwable
    - RuntimeException

formatting:
  active: true
  android: false
  ChainWrapping:
    active: true
  CommentSpacing:
    active: true
  Filename:
    active: true
  FinalNewline:
    active: false
  ImportOrdering:
    active: false
  Indentation:
    active: false
    indentSize: 4
    continuationIndentSize: 8
  MaximumLineLength:
    active: true
    maxLineLength: 160
  ModifierOrdering:
    active: true
  NoBlankLineBeforeRbrace:
    active: true
  NoConsecutiveBlankLines:
    active: true
  NoEmptyClassBody:
    active: true
  NoItParamInMultilineLambda:
    active: false
  NoLineBreakAfterElse:
    active: true
  NoLineBreakBeforeAssignment:
    active: true
  NoMultipleSpaces:
    active: true
  NoSemicolons:
    active: true
  NoTrailingSpaces:
    active: true
  NoUnitReturn:
    active: true
  NoUnusedImports:
    active: true
  NoWildcardImports:
    active: false
  PackageName:
    active: true
  ParameterListWrapping:
    active: true
    indentSize: 8
  SpacingAroundColon:
    active: true
  SpacingAroundComma:
    active: true
  SpacingAroundCurly:
    active: true
  SpacingAroundKeyword:
    active: true
  SpacingAroundOperators:
    active: true
  SpacingAroundParens:
    active: true
  SpacingAroundRangeOperator:
    active: true
  StringTemplate:
    active: true

naming:
  active: true
  ClassNaming:
    active: true
    classPattern: '[A-Z${'$'}][a-zA-Z0-9${'$'}]*'
  ConstructorParameterNaming:
    active: true
    parameterPattern: '[a-z][A-Za-z0-9]*'
    privateParameterPattern: '[a-z][A-Za-z0-9]*'
    excludeClassPattern: '${'$'}^'
  EnumNaming:
    active: true
    enumEntryPattern: '^[A-Z][_a-zA-Z0-9]*'
  ForbiddenClassName:
    active: false
    forbiddenName: ''
  FunctionMaxLength:
    active: false
    maximumFunctionNameLength: 40
  FunctionMinLength:
    active: false
    minimumFunctionNameLength: 2
  FunctionNaming:
    active: true
    functionPattern: '^([a-z${'$'}][a-zA-Z${'$'}0-9]*)|(`.*`)${'$'}'
    excludeClassPattern: '${'$'}^'
    ignoreOverridden: true
  FunctionParameterNaming:
    active: true
    parameterPattern: '[a-z][A-Za-z0-9]*'
    excludeClassPattern: '${'$'}^'
    ignoreOverriddenFunctions: true
  MatchingDeclarationName:
    active: true
  MemberNameEqualsClassName:
    active: false
    ignoreOverriddenFunction: true
  ObjectPropertyNaming:
    active: true
    constantPattern: '[A-Za-z][_A-Za-z0-9]*'
    propertyPattern: '[A-Za-z][_A-Za-z0-9]*'
    privatePropertyPattern: '(_)?[A-Za-z][_A-Za-z0-9]*'
  PackageNaming:
    active: true
    packagePattern: '^[a-z]+(\.[a-z][A-Za-z0-9]*)*${'$'}'
  TopLevelPropertyNaming:
    active: true
    constantPattern: '[A-Z][_A-Z0-9]*'
    propertyPattern: '[A-Za-z][_A-Za-z0-9]*'
    privatePropertyPattern: '(_)?[A-Za-z][A-Za-z0-9]*'
  VariableMaxLength:
    active: false
    maximumVariableNameLength: 64
  VariableMinLength:
    active: false
    minimumVariableNameLength: 1
  VariableNaming:
    active: true
    variablePattern: '[a-z][A-Za-z0-9]*'
    privateVariablePattern: '(_)?[a-z][A-Za-z0-9]*'
    excludeClassPattern: '${'$'}^'
    ignoreOverridden: true

performance:
  active: true
  ArrayPrimitive:
    active: false
  ForEachOnRange:
    active: true
  SpreadOperator:
    active: true
  UnnecessaryTemporaryInstantiation:
    active: true

potential-bugs:
  active: true
  DuplicateCaseInWhenExpression:
    active: true
  EqualsAlwaysReturnsTrueOrFalse:
    active: false
  EqualsWithHashCodeExist:
    active: true
  ExplicitGarbageCollectionCall:
    active: true
  InvalidRange:
    active: false
  IteratorHasNextCallsNextMethod:
    active: false
  IteratorNotThrowingNoSuchElementException:
    active: false
  LateinitUsage:
    active: false
    excludeAnnotatedProperties: ""
    ignoreOnClassesPattern: ""
  UnconditionalJumpStatementInLoop:
    active: false
  UnreachableCode:
    active: true
  UnsafeCallOnNullableType:
    active: false
  UnsafeCast:
    active: true
  UselessPostfixExpression:
    active: false
  WrongEqualsTypeParameter:
    active: false

style:
  active: true
  CollapsibleIfStatements:
    active: false
  DataClassContainsFunctions:
    active: false
    conversionFunctionPrefix: 'to'
  EqualsNullCall:
    active: false
  EqualsOnSignatureLine:
    active: false
  ExplicitItLambdaParameter:
    active: false
  ExpressionBodySyntax:
    active: false
    includeLineWrapping: false
  ForbiddenComment:
    active: true
    values: 'TODO:,FIXME:,STOPSHIP:'
  ForbiddenImport:
    active: false
    imports: ''
  ForbiddenVoid:
    active: false
  FunctionOnlyReturningConstant:
    active: false
    ignoreOverridableFunction: true
    excludedFunctions: 'describeContents'
  LoopWithTooManyJumpStatements:
    active: false
    maxJumpCount: 1
  MagicNumber:
    active: true
    ignoreNumbers: '-1,0,1,2'
    ignoreHashCodeFunction: true
    ignorePropertyDeclaration: false
    ignoreConstantDeclaration: true
    ignoreCompanionObjectPropertyDeclaration: true
    ignoreAnnotation: false
    ignoreNamedArgument: true
    ignoreEnums: false
  MandatoryBracesIfStatements:
    active: false
  MaxLineLength:
    active: true
    maxLineLength: 160
    excludePackageStatements: true
    excludeImportStatements: true
    excludeCommentStatements: false
  MayBeConst:
    active: true
  ModifierOrder:
    active: true
  NestedClassesVisibility:
    active: false
  NewLineAtEndOfFile:
    active: false
  NoTabs:
    active: false
  OptionalAbstractKeyword:
    active: true
  OptionalUnit:
    active: false
  OptionalWhenBraces:
    active: false
  PreferToOverPairSyntax:
    active: false
  ProtectedMemberInFinalClass:
    active: false
  RedundantVisibilityModifierRule:
    active: false
  ReturnCount:
    active: true
    max: 2
    excludedFunctions: "equals"
    excludeLabeled: false
    excludeReturnFromLambda: true
  SafeCast:
    active: true
  SerialVersionUIDInSerializableClass:
    active: false
  SpacingBetweenPackageAndImports:
    active: false
  ThrowsCount:
    active: true
    max: 2
  TrailingWhitespace:
    active: false
  UnderscoresInNumericLiterals:
    active: false
    acceptableDecimalLength: 5
  UnnecessaryAbstractClass:
    active: false
    excludeAnnotatedClasses: "dagger.Module"
  UnnecessaryApply:
    active: false
  UnnecessaryInheritance:
    active: false
  UnnecessaryLet:
    active: false
  UnnecessaryParentheses:
    active: false
  UntilInsteadOfRangeTo:
    active: false
  UnusedImports:
    active: false
  UnusedPrivateClass:
    active: false
  UnusedPrivateMember:
    active: false
    allowedNames: "(_|ignored|expected|serialVersionUID)"
  UseDataClass:
    active: false
    excludeAnnotatedClasses: ""
  UtilityClassWithPublicConstructor:
    active: false
  VarCouldBeVal:
    active: false
  WildcardImport:
    active: false
    excludeImports: 'java.util.*,kotlinx.android.synthetic.*'
""".trim()