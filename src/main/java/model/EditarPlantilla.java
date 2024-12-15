package model;

import javax.swing.JComboBox;

public class EditarPlantilla {
    private JComboBox<String> cmbVestidoEditar;

    public EditarPlantilla(JComboBox<String> cmbVestidoEditar) {
        this.cmbVestidoEditar = cmbVestidoEditar;
    }

    // Método para agregar ítems al ComboBox
    public void agregarItems() {
        cmbVestidoEditar.addItem("Vestido coctelero");
        cmbVestidoEditar.addItem("Vestido cuello halter");
        cmbVestidoEditar.addItem("Vestido sin espalda");
        cmbVestidoEditar.addItem("Vestido en V");
        cmbVestidoEditar.addItem("Vestido halter con espalda");
        cmbVestidoEditar.addItem("Vestido halter cruzado");
        cmbVestidoEditar.addItem("Vestido con abertura");
    }
}
