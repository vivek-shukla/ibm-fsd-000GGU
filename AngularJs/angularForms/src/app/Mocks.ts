export class MockActivatedRoute {
    // here you can add your mock objects, like snapshot or parent or whatever
    // example:
    parent = {
      snapshot: {data: {title: 'myTitle ' } },
      routeConfig: { children: { filter: () => {} } }
    };
  }

  