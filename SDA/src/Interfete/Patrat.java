package Interfete;

public class Patrat implements Shape {
	private int size;
	private int borderWidth;
	private String fillColor;
	private static final String NUME_CONSTANTA = "Patrat";
	private HexColorValidator validate;
	private BorderClassValidator validateB;
	public  Patrat(int size,String fillcolor,int borderWidth)
	{
		this.size=size;
		this.fillColor=fillcolor;
		this.validate = new HexColorValidator();
		this.borderWidth=borderWidth;
		this.validateB=new BorderClassValidator();
	}
	public void draw() {
		if (size > 0) {
			int i, j;
			for (i = 1; i <= size; i++) {
				for (j = 1; j <= size; j++) {
					if (i == 1 || i == size || j==1 || j==size) 
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		} else
			throw new IllegalArgumentException("Numar negativ");
	}

	public double getArea() {
		if (size > 0) {
			size *= size;
			return size;
		} else
			throw new IllegalArgumentException("Numar negativ");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return NUME_CONSTANTA;
	}

	@Override
	public String getHexFillColor()
	{
		boolean a = validate.validate(fillColor);

		if (a == true)
			return fillColor;

		return "\0";
	}

	@Override
	public int getBorderWidth() {
		boolean a = validateB.validate(borderWidth);
		if (a == true)
			return borderWidth;

		return 0;
	}


	
}
