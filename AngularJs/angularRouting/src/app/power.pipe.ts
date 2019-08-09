import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'power'
})
export class PowerPipe implements PipeTransform {

  transform(variable :number, power: number): number {
    return Math.pow(variable,power);
  }

}
