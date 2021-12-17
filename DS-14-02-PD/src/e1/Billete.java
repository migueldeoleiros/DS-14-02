package e1;

import java.util.Date;

public final record Billete(String origen, String destino, Date fecha, float precio) {
}
