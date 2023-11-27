import { Component } from '@angular/core';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent {
  public toggleImage(): void {
    console.log('Image toggled!');
}

public product: any = {
  price: 19.99,
  productName: 'Sample Product'
};

}