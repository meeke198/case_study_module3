package com.codegym.case_study_module03_hien.controller;

import com.codegym.case_study_module03_hien.model.dto.OwnerDto;
import com.codegym.case_study_module03_hien.model.service.OwnerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "ownerServlet",
        urlPatterns = {"/owners", "/owner/detail", "/owner/add",
                "/owner/edit", "/owner/remove", "/"})
public class OwnerController extends HttpServlet {
    private OwnerService ownerService = null;
    @Override
    public void init() throws ServletException {
        ownerService = new OwnerService();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String action = req.getServletPath();

        switch (action) {
            case "/":
            case "/owners":
                req.setAttribute("owners", ownerService.findAll());
                req.getRequestDispatcher("/WEB-INF/view/owner/index.jsp").forward(req, resp);
                break;
            case "/owner/detail":
                Integer detailId = Integer.parseInt(req.getParameter("id"));
                req.setAttribute("owner", ownerService.find(detailId));
                req.getRequestDispatcher("/WEB-INF/view/owner/detail.jsp").forward(req, resp);
                break;
            case "/owner/add":
                req.getRequestDispatcher("/WEB-INF/view/owner/add.jsp").forward(req, resp);
                break;
            case "/owner/edit":
                Integer editId = Integer.parseInt(req.getParameter("id"));
                req.setAttribute("owner", ownerService.find(editId));
                req.getRequestDispatcher("/WEB-INF/view/owner/edit.jsp").forward(req, resp);
                break;
            case "/owner/remove":
                Integer removeId = Integer.parseInt(req.getParameter("id"));
                ownerService.remove(removeId);
                resp.sendRedirect(req.getContextPath() + "/owners");
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getServletPath();
        String gender = req.getParameter("gender");
        String name = req.getParameter("name");
        Date DOB = Date.valueOf(req.getParameter("DOB"));
        String address = req.getParameter("address");
        String phoneNumber = req.getParameter("phoneNumber");
        String email = req.getParameter("email");

        OwnerDto ownerDto = new OwnerDto(gender, name, DOB, address,
                phoneNumber, email);

        switch (action) {
            case "/owner/add":
                ownerService.add(ownerDto);
                resp.sendRedirect(req.getContextPath() + "/owners");
                break;
            case "/owner/edit":
                Integer id = Integer.parseInt(req.getParameter("id"));
                OwnerDto editOwnerDto = new OwnerDto( id, gender, name, DOB, address,
                        phoneNumber, email);
                ownerService.edit(editOwnerDto);
                resp.sendRedirect(req.getContextPath() + "/owners");
                break;
        }
    }
}
