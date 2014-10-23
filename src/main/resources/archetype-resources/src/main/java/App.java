#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import static spark.Spark.*;

// TODO Add appropriate copyright and license

public class App {
	
        public static void main(String[] args) {
            get("/hello", (req, res) -> "Hello World");
        }
}
