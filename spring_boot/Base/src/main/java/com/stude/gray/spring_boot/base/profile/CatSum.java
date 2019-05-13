package com.stude.gray.spring_boot.base.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created on 2019/5/3.
 *
 * @author Grak
 * @since 1.0
 */
@Service
@Profile("Cat")
public class CatSum implements CalculateService{

    @Override
    public int sum(int... nums) {
        System.out.println("Cat求和");
        return  Arrays.stream(nums).reduce(0,Integer::sum);
    }
}
