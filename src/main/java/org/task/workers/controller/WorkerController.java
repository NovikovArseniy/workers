package org.task.workers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;
import org.task.workers.model.HomeAddress;
import org.task.workers.model.WorkSchedule;
import org.task.workers.model.Worker;
import org.task.workers.repository.WorkerRepository;
import org.task.workers.repository.WorkScheduleRepository;
import org.task.workers.repository.HomeAddressRepository;

@Controller
public class WorkerController {

    @Autowired
    private WorkerRepository workerRepository;

    @Autowired
    private WorkScheduleRepository workScheduleRepository;

    @Autowired
    private HomeAddressRepository homeAddressRepository;

    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String getAllWorkers(Model model) {
        model.addAttribute("workers", workerRepository.getAllWorkers());
        return "workers";
    }

    @RequestMapping(value = { "/worker_info" }, method = RequestMethod.GET)
    public String getWorkerInfo(@RequestParam(value = "id", required = false) int id, Model model) {

        Worker worker = workerRepository.getWorkerById(id);
        HomeAddress homeAddress = homeAddressRepository.getHomeAddressByWorkerId(id);
        WorkSchedule workSchedule = workScheduleRepository.getWorkScheduleByWorkerId(id);

        model.addAttribute("worker", worker);
        model.addAttribute("homeAddress", homeAddress);
        model.addAttribute("workSchedule", workSchedule);

        return "worker_info";
    }
}