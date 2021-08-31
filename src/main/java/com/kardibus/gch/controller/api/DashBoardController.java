package com.kardibus.gch.controller.api;

import com.kardibus.gch.domain.DashBoard;
import com.kardibus.gch.repository.DashBoardRepository;
import com.kardibus.gch.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/dashboard/")
public class DashBoardController {

    @Autowired
    private DashBoardRepository dashBoardRepository;
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping()
    public List<DashBoard> getAllDashBoard() {
        return dashBoardRepository.findAll();
    }

    @PostMapping()
    public void addDashBoard(@RequestBody DashBoard dashBoard) {
        dashBoardRepository.save(dashBoard);
    }

    @DeleteMapping()
    public void deleteDashBoard(@RequestBody DashBoard dashBoard) {
        dashBoardRepository.deleteById(dashBoard.getId());
    }

    @PutMapping
    public void updateDashBoard(@RequestBody DashBoard dashBoard) {
        DashBoard db = dashBoardRepository.getById(dashBoard.getId());
        db.setFlats(dashBoard.getFlats());
        db.setUsers(usersRepository.getById(dashBoard.getUsers().getId()));
        dashBoardRepository.save(db);
    }
}
