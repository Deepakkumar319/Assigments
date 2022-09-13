package com.sonata.Example;

	import com.sonata.DAOImpl.ProductImpl;

	import com.sonata.Model.Product;

	public class ProductApp {
		public static void main(String[] args) {
			Product p1 = new Product();
			Product p2 = new Product();
			Product p3 = new Product();
			Product p4 = new Product();
			p1.setProductID(1);
			p1.setProductName("Laptop");
			p1.setProductPrice(50000.00);
			p2.setProductID(2);
			p2.setProductName("Mobile Phone");
			p2.setProductPrice(50000.00);
			p3.setProductID(3);
			p3.setProductName("Chair");
			p3.setProductPrice(35000.00);
			p4.setProductID(p2.getProductID());
			p4.setProductName("T-Shirt");
			p4.setProductPrice(500.00);
			
			ProductImpl pImpl = new ProductImpl();
			
			System.out.println(pImpl.addProduct(p1));
			System.out.println(pImpl.addProduct(p2));
			System.out.println(pImpl.addProduct(p3));
			pImpl.displayProduct();	// Display 'product' Table
			System.out.println("\n");
			
			
			System.out.println(pImpl.deleteProduct(p1));
			pImpl.displayProduct();	// Display 'product' Table
			System.out.println("\n");
			
			
			System.out.println(pImpl.updateProduct(p4));
			pImpl.displayProduct();	// Display 'product' Table
			System.out.println("\n");
		}
    }
		
	