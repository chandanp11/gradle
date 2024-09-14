package org.example;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.junit.Assert.assertEquals;

import java.io.PrintWriter;
import java.io.StringWriter;

public class CouponServletTest {

    @Mock private HttpServletRequest request;
    @Mock private HttpServletResponse response;
    @Mock private RequestDispatcher requestDispatcher;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void doGet() throws Exception{
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(printWriter);

        new CouponServlet().doGet(request, response);
        assertEquals("SUPERSALE", stringWriter.toString());
    }

    @Test
    public void doPost() throws Exception{
        when(request.getParameter("coupon")).thenReturn("SUPERSALE");
        when(request.getRequestDispatcher("response.jsp")).thenReturn(requestDispatcher);
        new CouponServlet().doPost(request, response);
        verify(request).setAttribute("discount", "discount for coupon SUPERSALE is 50%");
        verify(requestDispatcher).forward(request, response);
    }
}