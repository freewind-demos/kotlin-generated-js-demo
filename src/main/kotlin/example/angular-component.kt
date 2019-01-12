package example

class MyComponent {
    companion object {
        val annotations: Array<String> = arrayOf("annotation1", "annotation2")
        init {
            js("""
                eval("MyComponent.annotations = this.annotations");
            """)
        }
    }

    val title = "Hello MyComponent"

}

