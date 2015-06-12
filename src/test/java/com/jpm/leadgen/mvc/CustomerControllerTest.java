package com.jpm.leadgen.mvc;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.services.CustomerService;
import com.jpm.leadgen.rest.mvc.CustomerController;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * Created by Ronnie on 6/12/15.
 */
public class CustomerControllerTest {
    @InjectMocks
    private CustomerController controller;

    @Mock
    private CustomerService service;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void findAllCustomers() throws Exception {
        List<Customer> list = new ArrayList<Customer>();

        mockMvc.perform(get("/rest/customers")).andDo(print());
    }
}
