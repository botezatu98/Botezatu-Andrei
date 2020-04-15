package Interfete;

public class Dreptunghi implements Shape {
	
	private int width,height;
	private int borderWidth;
	private String fillColor;
	private HexColorValidator validate;
	private BorderClassValidator validateB;
	private static final String NUME_CONSTANTA = "Dreptunghi";
	
	public Dreptunghi(int width,int height,String fillColor,int borderWidth)
	{
		this.width=width;
		this.height=height;
		this.fillColor=fillColor;
		this.borderWidth=borderWidth;
		this.validateB=new BorderClassValidator();
		this.validate = new HexColorValidator();
	}


	@Override
	public void draw() {
		if (width > 0&&height>0) {
			int i, j;
			for (i = 1; i <=height; i++) {
				for (j = 1; j <= width; j++) {
					if (i == 1 || i == height || j == 1 || j == width)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		} else
			throw new IllegalArgumentException("Ati introdus un numar negativ");
		
	}

	@Override
	public double getArea() {
		if(width>0&&height>0)
		return width*height;
		else throw new IllegalArgumentException("Ati introdus un numar negativ");
			
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return NUME_CONSTANTA;
	}

	@Override
	public String getHexFillColor() {
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
