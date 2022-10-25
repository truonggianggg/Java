package SS7;

<?xml version="1.0" encoding="UTF-8"?>

        <?import javafx.scene.control.*?>
        <?import javafx.scene.text.*?>
        <?import java.lang.*?>
        <?import javafx.scene.layout.*?>

<Pane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/8" xmlns:fx="http://javafx.com/fxml/1" fx:controller="assignment6_javafx.Infor_markController">
<children>
<Text layoutX="171.0" layoutY="59.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Đăng nhập thông tin">
<font>
<Font size="28.0" />
</font>
</Text>
<TextField fx:id="txtName" layoutX="59.0" layoutY="93.0" promptText="Name" />
<TextField fx:id="txtEmail" layoutX="59.0" layoutY="146.0" promptText="Email" />
<TextField fx:id="txtMark" layoutX="58.0" layoutY="200.0" promptText="Mark" />
<Button onAction="#addMark_student" layoutX="178.0" layoutY="251.0" mnemonicParsing="false" text="Submit" />
<Button onAction="#sortByName" layoutX="26.0" layoutY="307.0" mnemonicParsing="false" text="Sort by name" />
<Button onAction="#sortByMark" layoutX="142.0" layoutY="307.0" mnemonicParsing="false" text="Sort by mark" />
<ListView fx:id="listView" layoutX="300.0" layoutY="93.0" prefHeight="243.0" prefWidth="238.0" />

</children>
</Pane>