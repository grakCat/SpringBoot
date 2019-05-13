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
@Profile("Dog")
public class DogSum implements CalculateService{

    @Override
    public int sum(int... nums) {
        System.out.println("Dog求和");
        return  Arrays.stream(nums).reduce(0,Integer::sum);
    }
}
