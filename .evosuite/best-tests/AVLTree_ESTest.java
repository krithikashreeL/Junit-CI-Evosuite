/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 20:13:01 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AVLTree_ESTest extends AVLTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-923));
      // Undeclared exception!
      try { 
        aVLTree0.insert((-923));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-2639));
      aVLTree0.delete(0);
      aVLTree0.insert((-3686));
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      aVLTree0.insert((-2225));
      aVLTree0.delete((-2225));
      aVLTree0.insert((-2225));
      aVLTree0.delete(2761);
      aVLTree0.height();
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      aVLTree0.delete(1);
      aVLTree0.find(0);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-979));
      aVLTree0.insert(27);
      aVLTree0.insert((-498));
      aVLTree0.insert((-27));
      aVLTree0.insert(1);
      aVLTree0.delete((-498));
      aVLTree0.insert((-955));
      aVLTree0.delete(1541);
      aVLTree0.find((-4488));
      aVLTree0.find((-498));
      aVLTree0.find(1);
      aVLTree0.find(1);
      aVLTree0.find((-2769));
      aVLTree0.find(1161);
      aVLTree0.find(27);
      assertEquals(2, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.delete(3);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-1876));
      aVLTree0.getBalance((AVLTree.Node) null);
      aVLTree0.getRoot();
      aVLTree0.getBalance((AVLTree.Node) null);
      aVLTree0.getRoot();
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1);
      aVLTree0.delete(733);
      aVLTree0.delete(1990);
      aVLTree0.insert(617);
      aVLTree0.delete(0);
      aVLTree0.find(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree_Node0.key = 564;
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.height = 0;
      aVLTree_Node1.key = 0;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node1.left = aVLTree_Node0.left;
      aVLTree_Node0.left.height = 0;
      aVLTree0.delete(0);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.height();
      aVLTree0.getRoot();
      aVLTree0.delete(318);
      int int0 = (-3565);
      // Undeclared exception!
      try { 
        aVLTree0.insert(int0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-1876));
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      aVLTree0.insert((-3091));
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.delete((-1876));
      aVLTree0.getBalance(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1);
      aVLTree0.delete(733);
      aVLTree0.delete(1990);
      aVLTree0.insert(617);
      aVLTree0.delete(0);
      aVLTree0.find(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node1.key = 0;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree_Node1.left = aVLTree_Node0.left;
      aVLTree_Node0.left.height = 0;
      // Undeclared exception!
      aVLTree0.delete(0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.insert((-109));
      aVLTree0.insert((-2479));
      aVLTree0.find(1578);
      aVLTree0.getRoot();
      aVLTree0.find(0);
      aVLTree0.find(2578);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1250));
      aVLTree0.delete((-1250));
      aVLTree0.insert((-1250));
      aVLTree0.delete((-1250));
      aVLTree0.insert((-1250));
      aVLTree0.delete(1);
      aVLTree0.delete(1);
      aVLTree0.delete((-1));
      aVLTree0.insert(1);
      aVLTree0.insert(1573);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node((-2237));
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.right;
      aVLTree_Node0.right = null;
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      aVLTree_Node0.height = (-2237);
      aVLTree_Node0.left = null;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree_Node0.right = null;
      aVLTree_Node0.height = (-2237);
      aVLTree0.insert((-675));
      aVLTree0.insert((-2237));
      // Undeclared exception!
      try { 
        aVLTree0.insert((-2237));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(0);
      int int0 = 0;
      aVLTree0.insert((-3686));
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      aVLTree0.insert(1);
      aVLTree0.delete(1);
      aVLTree0.insert(1);
      aVLTree0.delete(2761);
      aVLTree0.height();
      aVLTree0.find((-969));
      aVLTree0.delete(0);
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      // Undeclared exception!
      try { 
        aVLTree0.delete(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1811));
      aVLTree0.height();
      aVLTree0.find((-1811));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-1));
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      aVLTree0.insert((-740));
      aVLTree0.insert((-933));
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree_Node0.height = 0;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.getBalance(aVLTree_Node0);
      // Undeclared exception!
      try { 
        aVLTree0.delete((-740));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1);
      aVLTree0.delete(1);
      aVLTree0.delete(4373);
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(1);
      aVLTree0.insert(1);
      AVLTree.Node aVLTree_Node1 = aVLTree0.new Node(1);
      aVLTree_Node1.height = 1;
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree0.getBalance(aVLTree_Node0);
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      aVLTree_Node2.right = aVLTree_Node1;
      aVLTree0.getBalance(aVLTree_Node2);
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 0;
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      int int1 = (-2038);
      aVLTree0.delete((-2038));
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.height();
      AVLTree.Node aVLTree_Node1 = aVLTree0.find(0);
      aVLTree_Node0.right = aVLTree_Node1;
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      aVLTree_Node0.left = aVLTree_Node2;
      aVLTree_Node2.right = aVLTree_Node0;
      aVLTree_Node1.height = 2854;
      int int2 = (-535);
      aVLTree_Node1.height = 0;
      // Undeclared exception!
      try { 
        aVLTree0.insert(int2);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(0);
      int int0 = 0;
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      AVLTree.Node aVLTree_Node1 = aVLTree0.find(0);
      aVLTree_Node0.left = aVLTree_Node1;
      int int1 = 1;
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree_Node1.key = 0;
      aVLTree_Node1.right = aVLTree_Node0;
      // Undeclared exception!
      try { 
        aVLTree0.delete(int1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(2989);
      aVLTree0.insert(765);
      aVLTree0.insert(1);
      aVLTree0.delete((-1091));
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.height();
      // Undeclared exception!
      aVLTree0.find(0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-1));
      aVLTree0.insert((-8));
      aVLTree0.delete((-1));
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      aVLTree0.delete(945);
      aVLTree0.insert((-12));
      aVLTree0.insert((-1));
      aVLTree0.insert(1205);
      aVLTree0.height();
      aVLTree0.delete((-12));
      aVLTree0.find(4);
      aVLTree0.find(945);
      aVLTree0.find((-1017));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1222));
      aVLTree0.insert(4402);
      aVLTree0.delete(1144);
      aVLTree0.insert(147);
      aVLTree0.insert(1144);
      aVLTree0.delete(1144);
      aVLTree0.insert((-2838));
      aVLTree0.height();
      aVLTree0.delete(1144);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree_Node1.height = 0;
      aVLTree0.getBalance(aVLTree_Node1);
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree0.getRoot();
      aVLTree0.insert(2);
      aVLTree_Node1.height = 147;
      aVLTree0.getBalance(aVLTree_Node1);
      // Undeclared exception!
      try { 
        aVLTree0.delete(aVLTree_Node1.height);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1222));
      aVLTree0.insert(4402);
      aVLTree0.delete(1144);
      aVLTree0.insert(147);
      aVLTree0.insert(1144);
      aVLTree0.delete(1144);
      aVLTree0.insert((-2838));
      aVLTree0.height();
      aVLTree0.delete(1144);
      aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree_Node0.height = 0;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.getRoot();
      aVLTree0.insert(2);
      aVLTree_Node0.height = 147;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.delete(0);
      aVLTree0.delete((-1907));
      aVLTree0.find(1);
      aVLTree0.getBalance((AVLTree.Node) null);
  }
}
