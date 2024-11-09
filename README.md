# Shopping Kata
### 🎥 Objectives
The purpose of this kata is to practice the basic principles of OOP, such as Abstraction, Encapsulation, Inheritance, Polymorphism, and Interfaces using TDD.

### ⚙️ Requirements
TDD is required. 
<aside> 🚧 Test → Red → Green → Refactor 🔁 </aside>
You can't write code without a failing test.
You can’t write new tests that don't fail.
Always write the simplest solution to make the tests pass. Refactor afterward.

### ⚙️ Functional Requirements
The price of free products (FreeProduct) is always zero

All products have a name and price.

Food products (FoodProduct) can have a discount (%) applied:

The price of a product without discount is the original price of the product.
The price of a discounted product is the original price with the assigned discount % applied.
The shopping cart (Cart) can have products added one by one (but can't contain duplicate products).

We can check the list of products added to the cart.

The cart allows removing a product by its name.

The shopping cart (Cart) contains a number of products (can be zero).

The total cost of the cart is the sum of the product prices with discounts applied.

Book products have an author and a description (in addition to name and price) and may have a discount applied, but not greater than 10%.

### ✓ Analysis Questions
What type of relationship exists between products and the cart?
What type of relationship exists between different types of products?
What techniques are used to apply discounts to products?
Draw a UML class diagram for the kata.

### 🗝 UML and Class Relationships
Inheritance (is a), indicated by the triangular arrow —|>
Dependency (has a), indicated by the arrow —>