package org.codesandtags.utils;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Factura {

	private String RVF;
	private String cliente;
	private String codCliente;
	private String numFactura;
	private ArrayList<Producto> productos = new ArrayList<Factura.Producto>();
	private Hashtable<String, String> equivalenciasProductos = new Hashtable<String, String>();

	public Factura() {
		// Apenas se crea la factura se colocan las equivalencias
		equivalenciasProductos.put("LOSARTAN 50 MG", "LOSARTAN 50MG");
		equivalenciasProductos.put("LORATADINA 10 MG", "LORATADINA 10MG");
		equivalenciasProductos.put("DESLORATADINA 0.5% JB",	"DESLORATADINA 0,05");

	}

	class Producto {
		private String descripcion;
		private String cantidad;
		private String fecha;

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getCantidad() {
			return cantidad;
		}

		public void setCantidad(String cantidad) {
			this.cantidad = cantidad;
		}

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}
	}

	public String getEquilvalencia(String expresion) {
		Enumeration<String> llaves = equivalenciasProductos.keys();

		if (equivalenciasProductos.containsKey(expresion)) {
			return equivalenciasProductos.get(expresion);
		} else {
			return "";
		}

	}

	public void addProducto(String descripcion, String cantidad, String fecha) {
		Producto producto = new Producto();
		producto.setCantidad(cantidad);
		producto.setDescripcion(descripcion);
		producto.setFecha(fecha);
		productos.add(producto);
	}

	public String getRVF() {
		return RVF;
	}

	public void setRVF(String rVF) {
		RVF = rVF;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void mostrarProductos() {
		for (Producto p : productos) {
			System.out.println("   Producto : ");
			System.out.println("     Descripcion : " + p.getDescripcion());
			System.out.println("     Cantidad    : " + p.getCantidad());
			System.out.println("     Descripcion : " + p.getFecha());
		}
	}

}
