module kek.zold {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens kek.zold to javafx.fxml;
    exports kek.zold;
}
