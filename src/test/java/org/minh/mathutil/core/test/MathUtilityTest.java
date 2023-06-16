/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.minh.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.minh.mathutil.core.MathUtinity;

/**
 *
 * @author admin
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
//        assertEquals(69,69);
        assertEquals(1, MathUtinity.getFactorial(0));
        assertEquals(1, MathUtinity.getFactorial(1));
        assertEquals(2, MathUtinity.getFactorial(2));
        assertEquals(6, MathUtinity.getFactorial(3));
        assertEquals(24, MathUtinity.getFactorial(4));
        assertEquals(120, MathUtinity.getFactorial(5));

    }
}



//TDD: TEST DRIVEN DEVELOPMENT:
//Kĩ thuật lập trình mà dev code đến đâu viết bộ test đến đó(JUnit, Mocha)
//
// HỌC KĨ THUẬT KIỂM THỬ CHO DÂN DEV - KĨ THUẬT DDT



//DATA DRIVEN TESTING - BỔ TRỢ CHO VIỆC XÀI UNIT TEST 
//GIÚP CÁC TEST CASE DỄ ĐOC HƠN, DỄ BẢO TRÌ HƠN
//PHẦN MỞ RỘNG CỦA TDD
//LÀ KĨ THUẬT VIẾT CODE KIỂM THỬ MÀ TÁCH BỘ DATA KIỂM THỬ
//RA KHỎI CÂU LỆNH ASERTEQUALS() CHO DỄ KIỂM SOÁT TEST CASE

//DDT laf phần mở rộng cho TDD giúp cho code test dễ đọc hơn, bảo trì, dễ
//dàng phát hiện thieus test case hơn

//DDT TÁCH DATA KIỂM THỬ RA 1 CHỖ RIÊNG THƯỜNG LÀ MẢNG 2 CHIỀU
//VÌ CÓ NHIỀU CỘT, CÁC CỘT CHÍNH LÀ DATA ĐƯA VÀO VÀ EXPECTED
//VÀ TA CẦN CÓ NHIỀU DÒNG NHƯ THẾ ỨNG VỚI CÁC TEST CASE

//VÀ MẢNG 2 CHIỀU NÀY ĐỔ TỪ TỪ VÀO TRONG HÀM ASSERTEQUALS()
//KĨ THUẬT TÁCH DATA LIST RIÊNG RA 1 CHỖ LÀ DDT
//DATA DRVEN TESTIGN - VIẾT CODE TEST HƯỚNG VỀ VIỆC TÁCH DATA
//
//DATA ĐC ĐƯA VÀO TRỞ LẠI QUA CÁC THAM SỐ
//NÊN DDT ĐC GỌI LÀ PARAMETERIZED TESTING
//THAM SỐ HÓA CÁI DATA TEST, BIẾN DATA TEST THÀNH THAM SỐ
//VÀ ĐƯA VÀO HÀM ASSERTEQUALS


