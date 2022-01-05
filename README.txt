This demo shows how Annotation in Java works.

It is assumed that Class TestWhetherIsNobug is a class builded by someone else. I want to test it whether all method are
right. So I add @ArithmeeticCheck annotation to each method I want to test, and use reflection to invoke them in TestTool
class. Beware that only annotated by @ArithmeticCheck could be tested.

Test report:

1234567890
1-1=0
1+1=11
3 x 5=15
divisionhas error
  caused by ArithmeticException
/ by zero
TestWhetherIsNoBug has 1 errors.

