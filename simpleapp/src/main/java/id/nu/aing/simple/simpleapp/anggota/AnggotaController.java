package id.nu.aing.simple.simpleapp.anggota;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/anggota")
public class AnggotaController {

    @GetMapping
    public List<String> getAnggota(){
        return List.of("Nama : Mohamad Jaelani","Pekerjaan:Java Developer","Alamat:Bogor");
    }
}
