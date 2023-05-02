fun main(args: Array<String>) {
	var nullableString: String? = "Hello, World!" // nullable type
	var nonNullableString: String = "Hello, World!" // non-nullable type

	nullableString = null // OK
	print(nullableString)
	//nonNullableString = null // Compilation error: Null can not be a value of a non-null type String

}