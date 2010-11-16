package edu.model.jb;

public class Analysis  implements Bean  {
	private Double id;
	private String name;
	private String value;
	private String image;//ver la forma de manejar la imagen
	
	public Double getId() {
		return id;
	}
	public void setId(Double id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public boolean isEqual(Bean bean) {
		// TODO Auto-generated method stub
		return false;
	}
	

	public String toString() {
		return (id+ ", " + name + ", " + value + ", " + image );
	}
}
