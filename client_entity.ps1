# Compilation du fichier Java
javac -cp TP_bean_entity.jar Client_entity.java

# Exécution du fichier Java avec la modification du CLASSPATH
java -cp "$env:CLASSPATH;TP_bean_entity.jar" --add-opens java.base/java.lang=ALL-UNNAMED Client_entity

rm *.class