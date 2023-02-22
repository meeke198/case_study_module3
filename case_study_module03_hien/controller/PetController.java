//package com.codegym.case_study_module03_hien.controller;
//
//import com.codegym.case_study_module03_hien.model.dto.OwnerDto;
//import com.codegym.case_study_module03_hien.model.service.OwnerService;
//import com.codegym.case_study_module03_hien.model.service.PetService;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.sql.Date;
//
//@WebServlet(name = "petServlet",
//        urlPatterns = {"/pets", "/pet/detail", "/pet/add",
//                "/pet/edit", "/pet/remove"})
//public class PetController extends HttpServlet {
//    //    private static final long serialVersionUID = 1L;
//    private PetService petService = null;
////    private RoleService roleService = null;
//
//    @Override
//    public void init() throws ServletException {
//        petService = new PetService();
////        roleService = new RoleService();
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
//        String action = req.getServletPath();
//
//        switch (action) {
//            case "/":
//            case "/pets":
//                req.setAttribute("pets", petService.findAll());
//                req.getRequestDispatcher("/WEB-INF/view/pet/index.jsp").forward(req, resp);
//                break;
//            case "/pet/detail":
//                int detailId = Integer.parseInt(req.getParameter("id"));
//                req.setAttribute("pet", petService.find(detailId));
//                req.getRequestDispatcher("/WEB-INF/view/pet/detail.jsp").forward(req, resp);
//                break;
//            case "/pet/add":
////                req.setAttribute("owners", ownerService.findAll());
//                req.getRequestDispatcher("/WEB-INF/view/pet/add.jsp").forward(req, resp);
//                break;
//            case "/pet/edit":
////                req.setAttribute("owners", ownerService.findAll());
//                int editId = Integer.parseInt(req.getParameter("id"));
//                req.setAttribute("pet", petService.find(editId));
//                req.getRequestDispatcher("/WEB-INF/view/pet/edit.jsp").forward(req, resp);
//                break;
//            case "/owner/remove":
//                int removeId = Integer.parseInt(req.getParameter("id"));
//                petService.remove(removeId);
//                resp.sendRedirect(req.getContextPath() + "/pets");
//                break;
//        }
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String action = req.getServletPath();
//
////        String roleIdStr = req.getParameter("roleId");
////        Integer roleId = (roleIdStr != null) ? Integer.parseInt(roleIdStr) : null;
//
//        Integer owner_id = Integer.parseInt(req.getParameter("owner_id"));
//        String name = req.getParameter("name");
//        Date DOB = Date.valueOf(req.getParameter("DOB"));
//        String species = req.getParameter("species");
//        String breed = req.getParameter("breed");
//        String health_status = req.getParameter("health_status");
//
//        PetDto petDto = new PetDto(owner_id, name, DOB, species,
//                breed, health_status);
//
//        switch (action) {
//            case "/pet/add":
//                petService.add(petDto);
//                resp.sendRedirect(req.getContextPath() + "/users");
//                break;
//            case "/pet/edit":
//                Integer id = Integer.parseInt(req.getParameter("id"));
//                PetDto editingPetDto = petService.find(id);
////                editingPetDto.setOwner_id(petDto.getOwner_id());
////                editingPetDto.setName(petDto.getName());
//
////                if (password != null) {
////                    String hashedPassword = BCrypt.hashpw(userDto.getPassword(), BCrypt.gensalt(10));
////                    editingUserDto.setPassword(hashedPassword);
////                }
//
//                editingPetDto.setOwner_id(petDto.getOwner_id());
//                editingPetDto.setName(petDto.getName());
//                editingPetDto.setDOB(petDto.getDOB());
//                editingPetDto.setSpecies(petDto.getSpecies());
//                editingPetDto.setBreed(petDto.getBreed());
//                editingPetDto.setHealth_status(petDto.getHealth_status());
//                petService.edit(editingPetDto);
//                resp.sendRedirect(req.getContextPath() + "/pets");
//                break;
//        }
//    }
//}
